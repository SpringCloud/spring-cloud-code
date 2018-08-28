package cn.springcloud.book.zuul.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author zunfa.zhong
 * @date 2018-7-15 20:57:55
 */
@Component
public class ZuulPropertiesRefresher implements ApplicationContextAware {

  private static final Logger logger = LoggerFactory.getLogger(ZuulPropertiesRefresher.class);
  private ApplicationContext applicationContext;

  @Autowired
  private RouteLocator routeLocator;

  @ApolloConfigChangeListener(value = "TEST1.zuul-config")
  public void onChange(ConfigChangeEvent changeEvent) {
    boolean zuulPropertiesChanged = false;
    for (String changedKey : changeEvent.changedKeys()) {
      if (changedKey.startsWith("zuul.")) {
        zuulPropertiesChanged = true;
        break;
      }
    }

    if (zuulPropertiesChanged) {
      refreshZuulProperties(changeEvent);
    }
  }

  private void refreshZuulProperties(ConfigChangeEvent changeEvent) {
    logger.info("Refreshing zuul properties!");

    /**
     * rebind configuration beans, e.g. ZuulProperties
     * @see org.springframework.cloud.context.properties.ConfigurationPropertiesRebinder#onApplicationEvent
     */
    this.applicationContext.publishEvent(new EnvironmentChangeEvent(changeEvent.changedKeys()));

    /**
     * refresh routes
     * @see org.springframework.cloud.netflix.zuul.ZuulServerAutoConfiguration.ZuulRefreshListener#onApplicationEvent
     */
    this.applicationContext.publishEvent(new RoutesRefreshedEvent(routeLocator));

    logger.info("Zuul properties refreshed!");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
