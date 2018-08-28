package cn.springcloud.book.dataservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: zhudeming
 * @description : 配置信息
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
public class DataConfig {

    private String defaultUser;

	public String getDefaultUser() {
		return defaultUser;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}
    
}
