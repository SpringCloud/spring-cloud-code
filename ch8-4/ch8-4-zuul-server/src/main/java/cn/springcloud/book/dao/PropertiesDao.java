package cn.springcloud.book.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import cn.springcloud.book.entity.ZuulRouteEntity;

@Component
public class PropertiesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static String SQL = "SELECT * FROM zuul_route WHERE enabled = TRUE";
	
	public Map<String, ZuulRoute> getProperties() {
		Map<String, ZuulRoute> routes = new LinkedHashMap<>();
		List<ZuulRouteEntity> list = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(ZuulRouteEntity.class));
		list.forEach(entity -> {
			if (StringUtils.isEmpty(entity.getPath())) return;
			ZuulRoute zuulRoute = new ZuulRoute();
			BeanUtils.copyProperties(entity, zuulRoute);
			routes.put(zuulRoute.getPath(), zuulRoute);
		});
		return routes;
	}
}
