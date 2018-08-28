package cn.springcloud.book.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.servlet.ServletInputStream;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StreamUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.netflix.zuul.http.HttpServletRequestWrapper;
import com.netflix.zuul.http.ServletInputStreamWrapper;

@Configuration
public class ModifyRequestEntityFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return PRE_DECORATION_FILTER_ORDER + 1;// =6
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		try {
			RequestContext context = RequestContext.getCurrentContext();
			String charset = context.getRequest().getCharacterEncoding();
			InputStream in = (InputStream) context.get("requestEntity");
			if (in == null)
				in = context.getRequest().getInputStream();
			String body = StreamUtils.copyToString(in, Charset.forName(charset));
			// 这里是新增的参数
			body += "&weight=140";
			byte[] bytes = body.getBytes(charset);
			context.setRequest(new HttpServletRequestWrapper(context.getRequest()) {

				@Override
				public ServletInputStream getInputStream() throws IOException {
					return new ServletInputStreamWrapper(bytes);
				}

				@Override
				public int getContentLength() {
					return bytes.length;
				}

				@Override
				public long getContentLengthLong() {
					return bytes.length;
				}
			});
		} catch (IOException e) {
			ReflectionUtils.rethrowRuntimeException(e);
		}
		return null;
	}
}
