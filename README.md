## 基于Spring Cloud的Finchley.RELEASE版:
http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html

由于聚合工程很多，Maven内存如果不足，请设置，欢迎**Star**。

## 工程明细


```
├── LICENSE
├── README.md
├── ch10-1
│   ├── ch10-1-common
│   │   ├── ch10-1-common.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── common
│   │   │       │                   ├── config
│   │   │       │                   │   └── CommonConfiguration.java
│   │   │       │                   ├── context
│   │   │       │                   │   ├── HystrixThreadCallable.java
│   │   │       │                   │   ├── HystrixThreadLocal.java
│   │   │       │                   │   ├── SpringCloudHystrixConcurrencyStrategy.java
│   │   │       │                   │   ├── SpringContextManager.java
│   │   │       │                   │   └── UserContextHolder.java
│   │   │       │                   ├── exception
│   │   │       │                   │   ├── BaseException.java
│   │   │       │                   │   ├── BaseExceptionBody.java
│   │   │       │                   │   └── CommonError.java
│   │   │       │                   ├── intercepter
│   │   │       │                   │   ├── FeignUserContextInterceptor.java
│   │   │       │                   │   ├── RestTemplateUserContextInterceptor.java
│   │   │       │                   │   └── UserContextInterceptor.java
│   │   │       │                   ├── util
│   │   │       │                   │   ├── AuthUtil.java
│   │   │       │                   │   ├── ExceptionUtil.java
│   │   │       │                   │   └── HttpConvertUtil.java
│   │   │       │                   └── vo
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── logback.xml
│   ├── ch10-1-config-server
│   │   ├── ch10-1-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch10-1-data-service
│   │   ├── ch10-1-data-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── dataservice
│   │   │       │                   ├── DataServiceApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── DataConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── DataController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-eureka-server
│   │   ├── ch10-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch10-1-hystrix-dashboard
│   │   ├── ch10-1-hystrix-dashboard.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── HystrixDashboardTurbineApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-user-service
│   │   ├── ch10-1-user-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── user
│   │   │       │                   ├── UserServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── service
│   │   │       │                       ├── IUserService.java
│   │   │       │                       ├── dataservice
│   │   │       │                       │   └── DataService.java
│   │   │       │                       ├── fallback
│   │   │       │                       │   └── UserClientFallback.java
│   │   │       │                       └── impl
│   │   │       │                           └── UserService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-zuul-server
│   │   ├── ch10-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   ├── AuthFilter.java
│   │   │       │                   └── ZuulFallback.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1.iml
│   └── pom.xml
├── ch11-1
│   ├── ch11-1-config-client
│   │   ├── ch11-1-client-config.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-1-config-server
│   │   ├── ch11-1-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch11-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch11-2
│   ├── ch11-2-config-client-refresh
│   │   ├── ch11-2-config-client-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-2-config-server
│   │   ├── ch11-2-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch11-2.iml
│   └── pom.xml
├── ch11-3
│   ├── ch11-3-config-client-bus-refresh
│   │   ├── ch11-3-config-client-bus-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-3-config-client-bus-refresh-second
│   │   ├── ch11-3-config-client-bus-refresh-second.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-3-config-server-bus
│   │   ├── ch11-3-config-server-bus.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── GitConfigServerApplication.java
│   │   │       │                   └── SecurityConfiguration.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── application.yml
│   ├── ch11-3.iml
│   └── pom.xml
├── ch12-1
│   ├── ch12-1-config-client-placeholders
│   │   ├── ch12-1-config-client-placeholders.iml
│   │   ├── config-client-placeholders.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-1-config-server-placeholders
│   │   ├── ch12-1-config-server-placeholders.iml
│   │   ├── config-server-placeholders.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── GitConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-1.iml
│   └── pom.xml
├── ch12-10
│   ├── ch12-10-config-client-apollo
│   │   ├── ch12-10-config-client-apollo.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ApolloClientApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── AppConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10-config-client-apollo2
│   │   ├── ch12-10-config-client-apollo2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ApolloClientApplicationNew.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── AppConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10-eureka-server
│   │   ├── ch12-10-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-10-gateway-zuul-apollo
│   │   ├── ch12-10-gateway-zuul-apollo.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── zuul
│   │   │       │                   ├── ZuulServerApplication.java
│   │   │       │                   └── config
│   │   │       │                       └── ZuulPropertiesRefresher.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10.iml
│   └── pom.xml
├── ch12-2
│   ├── ch12-2-config-client-multiple-repositories
│   │   ├── ch12-2-config-client-multiple-repositories.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-2-config-server-multiple-repositories
│   │   ├── ch12-2-config-server-multiple-repositories.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── GitConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-2.iml
│   └── pom.xml
├── ch12-3
│   ├── ch12-3-config-client-db
│   │   ├── ch12-3-config-client-db.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── DbConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-3-config-server-db
│   │   ├── ch12-3-config-server-db.iml
│   │   ├── pom.xml
│   │   ├── script
│   │   │   ├── ?\217\222?\205??\225??\215?.sql
│   │   │   └── ?\210\233建?\205\215置表.sql
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── DbConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-3.iml
│   └── pom.xml
├── ch12-4
│   ├── ch12-4-config-client-mongodb
│   │   ├── ch12-4-config-client-mongodb.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── boo
│   │   │       │               └── config
│   │   │       │                   └── mongodb
│   │   │       │                       ├── MongoDbConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-4-config-server-mongodb
│   │   ├── ch12-4-config-server-mongodb.iml
│   │   ├── pom.xml
│   │   ├── script
│   │   │   └── config.json
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── boo
│   │   │       │               └── config
│   │   │       │                   └── mongodb
│   │   │       │                       └── MongoDbConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-4.iml
│   └── pom.xml
├── ch12-5
│   ├── ch12-5-config-client-auto-refresh
│   │   ├── ch12-5-config-client-auto-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-5-config-client-refresh-autoconfig
│   │   ├── ch12-5-config-client-refresh-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigClientRefreshAutoConfiguration.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-5-config-server
│   │   ├── ch12-5-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-5.iml
│   └── pom.xml
├── ch12-6
│   ├── ch12-6-config-client-fallback
│   │   ├── ch12-6-config-client-fallback.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-6-config-client-fallback-autoconfig
│   │   ├── ch12-6-config-client-fallback-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       └── fallback
│   │   │       │                           ├── ConfigServerBootstrap.java
│   │   │       │                           └── FallbackableConfigServicePropertySourceLocator.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── configClient.properties
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── configClient.properties
│   ├── ch12-6-config-server
│   │   ├── ch12-6-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-6.iml
│   └── pom.xml
├── ch12-7
│   ├── ch12-7-config-client-auth-jwt
│   │   ├── ch12-7-config-client-auth-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── jwt
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-7-config-client-jwt
│   │   ├── ch12-7-config-client-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── jwt
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigClientBootstrapConfiguration.java
│   │   │       │                       └── dto
│   │   │       │                           ├── LoginRequest.java
│   │   │       │                           └── Token.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-7-config-server-auth-jwt
│   │   ├── ch12-7-config-server-auth-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ConfigGitApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── SecurityConfig.java
│   │   │       │                   ├── models
│   │   │       │                   │   ├── JwtAuthenticationRequest.java
│   │   │       │                   │   ├── JwtAuthenticationResponse.java
│   │   │       │                   │   └── JwtUser.java
│   │   │       │                   ├── rest
│   │   │       │                   │   └── AuthenticationRestController.java
│   │   │       │                   └── security
│   │   │       │                       ├── JwtAuthenticationEntryPoint.java
│   │   │       │                       ├── JwtTokenUtil.java
│   │   │       │                       ├── MemberServiceImpl.java
│   │   │       │                       ├── WebAuthenticationDetailsSourceImpl.java
│   │   │       │                       └── filters
│   │   │       │                           └── JwtAuthenticationTokenFilter.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-7.iml
│   └── pom.xml
├── ch12-8
│   ├── ch12-8-config-client-high-availability
│   │   ├── ch12-8-config-client-high-availability.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-8-config-client-high-availability-autoconfig
│   │   ├── ch12-8-config-client-high-availability-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── configuration
│   │   │       │                       ├── ConfigSupportConfiguration.java
│   │   │       │                       └── ConfigSupportProperties.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-8-config-server
│   │   ├── ch12-8-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-8.iml
│   └── pom.xml
├── ch12-9
│   ├── ch12-9-config-client
│   │   ├── ch12-9-config-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-9-config-server-high-availability
│   │   ├── ch12-9-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-9-eureka-server
│   │   ├── ch12-9-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-9.iml
│   └── pom.xml
├── ch13-1
│   ├── README.md
│   ├── ch13-1-consul-config
│   │   ├── README.md
│   │   ├── ch13-1-consul-config.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── config
│   │   │       │                       └── ConsulConfigApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1-consul-consumer
│   │   ├── README.md
│   │   ├── ch13-1-consul-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       ├── ConsulConsumerApplication.java
│   │   │       │                       └── HelloService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1-consul-provider
│   │   ├── README.md
│   │   ├── ch13-1-consul-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── consul
│   │   │   │   │                   └── provider
│   │   │   │   │                       └── ConsulProviderApplication.java
│   │   │   │   └── resources
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── core
│   │   │                           └── ConcurrentMapTest.java
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1.iml
│   └── pom.xml
├── ch14-1
│   ├── README.md
│   ├── ch14-1-consul-register
│   │   ├── ch14-1-consul-register.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── register
│   │   │       │                       └── ConsulRegisterApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-1.iml
│   └── pom.xml
├── ch14-2
│   ├── ch14-2-consul-consumer-discoveryclient
│   │   ├── ch14-2-consul-consumer-discoveryclient.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── discoveryclient
│   │   │       │                           └── ConsulConsumerDiscoveryclientApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-consumer-ribbon
│   │   ├── ch14-2-consul-consumer-ribbon.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── ribbon
│   │   │       │                           ├── ConsulConsumerRibbonApplication.java
│   │   │       │                           └── HelloService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-provider-tag-1
│   │   ├── ch14-2-consul-provider-tag-1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag1
│   │   │       │                           └── ConsulProviderTag1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-provider-tag-2
│   │   ├── ch14-2-consul-provider-tag-2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag2
│   │   │       │                           └── ConsulProviderTag2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-cosul-provider-tag-1
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── consul
│   │           │                   └── provider
│   │           │                       └── tag1
│   │           │                           └── ConsulProviderTag1Application.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch14-2.iml
│   └── pom.xml
├── ch14-3
│   ├── ch14-3-consul-config-customize
│   │   ├── ch14-3-consul-config-customize.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── config
│   │   │       │                       └── customize
│   │   │       │                           └── ConsulCustomizeApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch14-3.iml
│   └── pom.xml
├── ch14-4
│   ├── ch14-4-consul-override-consumer
│   │   ├── ch14-4-consul-override-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── discoveryclient
│   │   │       │                           ├── ConsulConsumerDiscoveryclientApplication.java
│   │   │       │                           └── MyConsulDiscoveryClient.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4-consul-override-provider-tag1
│   │   ├── ch14-4-consul-override-provider-tag1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag1
│   │   │       │                           └── ConsulProviderTag1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4-consul-override-provider-tag2
│   │   ├── ch14-4-consul-override-provider-tag2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag2
│   │   │       │                           └── ConsulProviderTag2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4.iml
│   └── pom.xml
├── ch14-5
│   ├── ch14-5-consul-override-consumer
│   │   ├── ch14-5-consul-override-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── override
│   │   │       │                       └── consumer
│   │   │       │                           └── consulserverlist
│   │   │       │                               ├── ConsulConsumerApplication.java
│   │   │       │                               ├── Hello1Service.java
│   │   │       │                               ├── Hello2Service.java
│   │   │       │                               └── MyConsulServerList.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-override-consumer-new
│   │   ├── ch14-5-consul-override-consumer-new.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── override
│   │   │       │                       └── consumer
│   │   │       │                           ├── myconsultool
│   │   │       │                           │   ├── MyConsulRibbonClientConfiguration.java
│   │   │       │                           │   ├── MyConsulServerList.java
│   │   │       │                           │   └── MyRibbonConsulAutoConfiguration.java
│   │   │       │                           └── newconsulserverlist
│   │   │       │                               ├── Hello1Service.java
│   │   │       │                               ├── Hello2Service.java
│   │   │       │                               └── NewConsulConsumerApplication.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-provider1
│   │   ├── ch14-5-consul-provider1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider1
│   │   │       │                       └── ConsulProvider1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-provider2
│   │   ├── ch14-5-consul-provider2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider2
│   │   │       │                       └── ConsulProvider2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5.iml
│   └── pom.xml
├── ch15-1
│   ├── ch15-1-client-service
│   │   ├── ch15-1-client-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── ClientApplication.java
│   │           │               └── controller
│   │           │                   └── TestController.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1-core-service
│   │   ├── ch15-1-core-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── common
│   │           │                   ├── config
│   │           │                   │   └── CommonConfiguration.java
│   │           │                   ├── intercepter
│   │           │                   │   ├── RestTemplateUserContextInterceptor.java
│   │           │                   │   ├── UserContextHolder.java
│   │           │                   │   └── UserContextInterceptor.java
│   │           │                   ├── util
│   │           │                   │   └── UserPermissionUtil.java
│   │           │                   └── vo
│   │           │                       └── User.java
│   │           └── resources
│   │               ├── META-INF
│   │               │   └── spring.factories
│   │               └── logback.xml
│   ├── ch15-1-eureka-service
│   │   ├── ch15-1-eureka-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── EurekaServerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1-gateway
│   │   ├── ch15-1-gateway.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── gateway
│   │           │                   ├── GatewayApplication.java
│   │           │                   └── filter
│   │           │                       ├── AuthFilter.java
│   │           │                       ├── JwtUtil.java
│   │           │                       ├── PermissionException.java
│   │           │                       └── TokenController.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch15-1-provider-service
│   │   ├── ch15-1-provider-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── ProviderApplication.java
│   │           │               └── controller
│   │           │                   └── ProviderController.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1.iml
│   └── pom.xml
├── ch16-1
│   ├── ch16-1-sleuth-consumer
│   │   ├── ch16-1-sleuth-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── consumer
│   │           │                       ├── ConsumerConfiguration.java
│   │           │                       ├── ConsumerController.java
│   │           │                       ├── HelloService.java
│   │           │                       └── SleuthConsumerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-1-sleuth-provider
│   │   ├── ch16-1-sleuth-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── provider
│   │           │                       ├── ProviderController.java
│   │           │                       └── SleuthProviderApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-1.iml
│   └── pom.xml
├── ch16-2
│   ├── ch16-2-sleuth-consumer
│   │   ├── ch16-2-sleuth-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── consumer
│   │           │                       ├── ConsumerController.java
│   │           │                       ├── HelloService.java
│   │           │                       ├── SessionFilter.java
│   │           │                       └── SleuthConsumerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-2-sleuth-provider
│   │   ├── ch16-2-sleuth-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── provider
│   │           │                       ├── ProviderController.java
│   │           │                       └── SleuthProviderApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-2.iml
│   └── pom.xml
├── ch16-3
│   ├── ch16-3-eureka-server-skywalking
│   │   ├── ch16-3-eureka-skywalking.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── eureka
│   │           │                   └── EurekaServerApplication.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-script
│   │   ├── ch16-3-script.iml
│   │   ├── pom.xml
│   │   └── script
│   │       ├── drop-hbase.txt
│   │       └── init-hbase.txt
│   ├── ch16-3-service-a
│   │   ├── ch16-3-service-a.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── AServiceApplication.java
│   │           │               ├── controller
│   │           │               │   └── SkyController.java
│   │           │               └── service
│   │           │                   └── SkyFeignSerivece.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-service-b
│   │   ├── ch16-3-sevice-b.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── BServiceApplication.java
│   │           │               └── controller
│   │           │                   └── SkySecondController.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-zuul-skywalking
│   │   ├── ch16-3-zuul-skywalking.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── zuul
│   │           │                   └── ZuulServerApplication.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3.iml
│   └── pom.xml
├── ch17-1
│   ├── ch17-1-1-gateway
│   │   ├── ch17-1-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-1-2-gateway
│   │   ├── ch17-1-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-1.iml
│   └── pom.xml
├── ch17-2
│   ├── ch17-2-1-gateway
│   │   ├── ch17-2-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── gateway
│   │   │   │   │               │   └── SCGatewayApplication.java
│   │   │   │   │               └── utils
│   │   │   │   │                   └── UtcTimeUtil.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SC1721GatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-2-gateway
│   │   ├── ch17-2-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── gateway
│   │   │       │               │   └── SpringCloudGatewayApplication.java
│   │   │       │               └── utils
│   │   │       │                   └── UtcTimeUtil.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SpringCloudGatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-3-gateway
│   │   ├── ch17-2-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── gateway
│   │   │   │   │               │   └── SCGatewayApplication.java
│   │   │   │   │               └── utils
│   │   │   │   │                   └── UtcTimeUtil.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SCGatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-4-gateway
│   │   ├── ch17-2-4-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── CookieRoutePredicateFactoryTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── CookieRoutePredicateFactoryTests.class
│   ├── ch17-2-5-gateway
│   │   ├── ch17-2-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-6-gateway
│   │   ├── ch17-2-6-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── ScGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── ScGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-7-gateway
│   │   ├── ch17-2-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-8-gateway
│   │   ├── ch17-2-8-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-9-gateway
│   │   ├── ch17-2-7-gateway.iml
│   │   ├── ch17-2-9-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-service
│   │   ├── ch17-2-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ServiceProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ServiceProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2.iml
│   └── pom.xml
├── ch17-3
│   ├── ch17-3-1-gateway
│   │   ├── ch17-3-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-2-gateway
│   │   ├── ch17-3-2-gateway.iml
│   │   ├── ch17-3-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-3-3-gateway
│   │   ├── ch17-3-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-4-gateway
│   │   ├── ch17-3-4-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-5-gateway
│   │   ├── ch17-3-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-6-gateway
│   │   ├── ch17-3-6-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── CH1736GatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── CH1736GatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-7-gateway
│   │   ├── ch17-3-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   ├── CH1737GatewayApplication.java
│   │   │   │   │                   └── FallbackController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   ├── CH1737GatewayApplication.class
│   │       │                   ├── FallbackController.class
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-service
│   │   ├── ch17-3-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ServiceProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ServiceProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-3.iml
│   └── pom.xml
├── ch18-1
│   ├── ch18-1-consumer
│   │   ├── ch18-1-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── HelloConsumerApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── HelloController.java
│   │   │       │               └── feign
│   │   │       │                   └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloConsumerApplication.class
│   │       │               ├── controller
│   │       │               │   └── HelloController.class
│   │       │               └── feign
│   │       │                   └── HelloFeignService.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-eureka
│   │   ├── ch18-1-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-gateway
│   │   ├── ch18-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── GatewayServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── GatewayServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-provider
│   │   ├── ch18-1-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── HelloProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1.iml
│   └── pom.xml
├── ch18-2
│   ├── ch18-2-gateway
│   │   ├── ch18-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── GatewayServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   ├── AuthSignatureFilter.java
│   │   │       │                   └── CustomGatewayFilter.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── GatewayServerApplication.class
│   │       │               └── filter
│   │       │                   ├── AuthSignatureFilter.class
│   │       │                   └── CustomGatewayFilter.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-2-provider
│   │   ├── ch18-2-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── HelloProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-2.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch18-3
│   ├── ch18-3-gateway
│   │   ├── ch18-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   └── GatewayApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── GatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-3-provider
│   │   ├── ch18-3-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── service
│   │   │       │                   ├── ServiceApplication.java
│   │   │       │                   └── ServiceController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── service
│   │       │                   ├── ServiceApplication.class
│   │       │                   └── ServiceController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-3.iml
│   └── pom.xml
├── ch18-4
│   ├── ch18-4-eureka
│   │   ├── ch18-4-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-4-gateway-https
│   │   ├── ch18-4-gateway-https.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   ├── GatewayApplication.java
│   │   │       │                   └── filter
│   │   │       │                       ├── HttpSchemeFilter.java
│   │   │       │                       └── HttpsToHttpFilter.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── selfsigned.jks
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── gateway
│   │       │   │               ├── GatewayApplication.class
│   │       │   │               └── filter
│   │       │   │                   ├── HttpSchemeFilter.class
│   │       │   │                   └── HttpsToHttpFilter.class
│   │       │   └── selfsigned.jks
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4-service-a
│   │   ├── ch18-4-service-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4-service-b
│   │   ├── ch18-4-service-b.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4.iml
│   ├── pom.xml
│   └── reademe.md
├── ch18-5
│   ├── ch18-5-eureka
│   │   ├── ch18-5-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-5-gateway
│   │   ├── ch18-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── GatewayApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── GatewaySwaggerProvider.java
│   │   │       │               ├── filter
│   │   │       │               │   └── GwSwaggerHeaderFilter.java
│   │   │       │               └── handler
│   │   │       │                   └── SwaggerHandler.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── GatewayApplication.class
│   │       │               ├── config
│   │       │               │   └── SwaggerProvider.class
│   │       │               ├── filter
│   │       │               │   └── SwaggerHeaderFilter.class
│   │       │               └── handler
│   │       │                   └── SwaggerHandler.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-5-service
│   │   ├── ch18-5-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ServiceProviderApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── SwaggerConfig.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── ServiceProviderApplication.class
│   │       │               ├── config
│   │       │               │   └── SwaggerConfig.class
│   │       │               └── controller
│   │       │                   └── TestController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-5.iml
│   └── pom.xml
├── ch18-6
│   ├── ch18-6-1-gateway
│   │   ├── ch18-6-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── filter
│   │   │   │   │                   └── GatewayRateLimitFilterByIp.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-2-gateway
│   │   ├── ch18-6-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── RemoteAddrKeyResolver.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           ├── GatewayApplication.class
│   │       │   │           ├── RemoteAddrKeyResolver.class
│   │       │   │           └── filter
│   │       │   │               ├── RateLimitByCpuGatewayFilter.class
│   │       │   │               └── RateLimitByIpGatewayFilter.class
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-3-gateway
│   │   ├── ch18-6-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── filter
│   │   │   │   │                   └── GatewayRateLimitFilterByCpu.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           ├── GatewayApplication.class
│   │       │   │           └── filter
│   │       │   │               ├── GatewayRateLimitFilterByCpu.class
│   │       │   │               ├── RateLimitByCpuGatewayFilter.class
│   │       │   │               └── RateLimitByIpGatewayFilter.class
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-provider
│   │   ├── ch18-6-provider.iml
│   │   ├── pom.xml
│   │   ├── producer.iml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── ProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── ProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   ├── ch18-6.iml
│   └── pom.xml
├── ch18-7
│   ├── ch18-7-gateway
│   │   ├── ch18-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   ├── GatewayApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── RouteController.java
│   │   │       │                   ├── model
│   │   │       │                   │   ├── GatewayFilterDefinition.java
│   │   │       │                   │   ├── GatewayPredicateDefinition.java
│   │   │       │                   │   └── GatewayRouteDefinition.java
│   │   │       │                   ├── repository
│   │   │       │                   │   └── UnifiedRouteRepositoryImpl.java
│   │   │       │                   └── route
│   │   │       │                       └── DynamicRouteServiceImpl.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   ├── GatewayApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── RouteController.class
│   │       │                   ├── model
│   │       │                   │   ├── GatewayFilterDefinition.class
│   │       │                   │   ├── GatewayPredicateDefinition.class
│   │       │                   │   └── GatewayRouteDefinition.class
│   │       │                   ├── repository
│   │       │                   │   └── DbRouteDefinitionRepository.class
│   │       │                   └── route
│   │       │                       └── DynamicRouteServiceImpl.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-7.iml
│   ├── pom.xml
│   └── readme.md
├── ch19-1
│   ├── ch19-1.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── cn
│   │   │   │       └── springcloud
│   │   │   │           ├── ChapterGrpcApplication.java
│   │   │   │           └── PersonUseCase.java
│   │   │   ├── proto
│   │   │   │   └── person.proto
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── cn
│   │               └── springcloud
│   │                   └── ChapterGrpcApplicationTests.java
│   └── target
│       ├── classes
│       │   └── cn
│       │       └── springcloud
│       │           ├── ChapterGrpcApplication.class
│       │           ├── PersonUseCase.class
│       │           └── proto
│       │               ├── PersonModel$1.class
│       │               ├── PersonModel$Person$1.class
│       │               ├── PersonModel$Person$Builder.class
│       │               ├── PersonModel$Person.class
│       │               ├── PersonModel$PersonOrBuilder.class
│       │               └── PersonModel.class
│       ├── generated-sources
│       │   ├── annotations
│       │   └── protobuf
│       │       └── java
│       │           └── cn
│       │               └── springcloud
│       │                   └── proto
│       │                       └── PersonModel.java
│       ├── generated-test-sources
│       │   └── test-annotations
│       ├── protoc-dependencies
│       │   └── 7fccca4fa45ec798ad2d10dc18b97d22
│       │       └── google
│       │           └── protobuf
│       │               ├── any.proto
│       │               ├── api.proto
│       │               ├── compiler
│       │               │   └── plugin.proto
│       │               ├── descriptor.proto
│       │               ├── duration.proto
│       │               ├── empty.proto
│       │               ├── field_mask.proto
│       │               ├── source_context.proto
│       │               ├── struct.proto
│       │               ├── timestamp.proto
│       │               ├── type.proto
│       │               └── wrappers.proto
│       ├── protoc-plugins
│       │   └── protoc-3.5.1-osx-x86_64.exe
│       └── test-classes
│           └── cn
│               └── springcloud
│                   └── ChapterGrpcApplicationTests.class
├── ch19-2
│   ├── ch19-2.iml
│   ├── grpc-lib-1
│   │   ├── grpc-lib-1.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── proto
│   │   │       │   └── HiService.proto
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   ├── HiService.proto
│   │       │   ├── application.properties
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpc
│   │       │               ├── HelloRequest$1.class
│   │       │               ├── HelloRequest$Builder.class
│   │       │               ├── HelloRequest$TagsDefaultEntryHolder.class
│   │       │               ├── HelloRequest.class
│   │       │               ├── HelloRequestOrBuilder.class
│   │       │               ├── HelloResponse$1.class
│   │       │               ├── HelloResponse$Builder.class
│   │       │               ├── HelloResponse.class
│   │       │               ├── HelloResponseOrBuilder.class
│   │       │               ├── HelloServiceGrpc$1.class
│   │       │               ├── HelloServiceGrpc$HelloServiceBaseDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceBlockingStub.class
│   │       │               ├── HelloServiceGrpc$HelloServiceFileDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceFutureStub.class
│   │       │               ├── HelloServiceGrpc$HelloServiceImplBase.class
│   │       │               ├── HelloServiceGrpc$HelloServiceMethodDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceStub.class
│   │       │               ├── HelloServiceGrpc$MethodHandlers.class
│   │       │               ├── HelloServiceGrpc.class
│   │       │               ├── HiService$1.class
│   │       │               └── HiService.class
│   │       ├── generated-sources
│   │       │   ├── annotations
│   │       │   └── protobuf
│   │       │       ├── grpc-java
│   │       │       │   └── cn
│   │       │       │       └── springcloud
│   │       │       │           └── grpc
│   │       │       │               └── HelloServiceGrpc.java
│   │       │       └── java
│   │       │           └── cn
│   │       │               └── springcloud
│   │       │                   └── grpc
│   │       │                       ├── HelloRequest.java
│   │       │                       ├── HelloRequestOrBuilder.java
│   │       │                       ├── HelloResponse.java
│   │       │                       ├── HelloResponseOrBuilder.java
│   │       │                       └── HiService.java
│   │       ├── grpc-lib-1-0.0.1-SNAPSHOT.jar
│   │       ├── maven-archiver
│   │       │   └── pom.properties
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       ├── protoc-dependencies
│   │       │   └── 7fccca4fa45ec798ad2d10dc18b97d22
│   │       │       └── google
│   │       │           └── protobuf
│   │       │               ├── any.proto
│   │       │               ├── api.proto
│   │       │               ├── compiler
│   │       │               │   └── plugin.proto
│   │       │               ├── descriptor.proto
│   │       │               ├── duration.proto
│   │       │               ├── empty.proto
│   │       │               ├── field_mask.proto
│   │       │               ├── source_context.proto
│   │       │               ├── struct.proto
│   │       │               ├── timestamp.proto
│   │       │               ├── type.proto
│   │       │               └── wrappers.proto
│   │       └── protoc-plugins
│   │           ├── protoc-3.5.1-osx-x86_64.exe
│   │           └── protoc-gen-grpc-java-1.11.0-osx-x86_64.exe
│   ├── grpc-simple-client
│   │   ├── grpc-simple-client.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── grpcsimpleclient
│   │   │       │               └── MyGrpcClient.java
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpcsimpleclient
│   │       │               └── MyGrpcClient.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── grpc-simple-server
│   │   ├── grpc-simple-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── grpcsimpleserver
│   │   │       │               ├── MyGrpcServer.java
│   │   │       │               └── servcie
│   │   │       │                   └── HelloService.java
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpcsimpleserver
│   │       │               ├── MyGrpcServer.class
│   │       │               └── servcie
│   │       │                   └── HelloService.class
│   │       └── generated-sources
│   │           └── annotations
│   └── pom.xml
├── ch2-1
│   ├── ch2-1-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch21EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-demo.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch21EurekaClientApplicationTests.java
│   ├── ch2-1-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch21EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-standalone.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch21EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch2-2
│   ├── ch2-2-eureka-client
│   │   ├── ch2-2-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-demo.yml
│   │           └── application.yml
│   ├── ch2-2-eureka-server
│   │   ├── ch2-2-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-standalone.yml
│   │           └── application.yml
│   └── ch2-2.iml
├── ch20
│   ├── ch20.iml
│   ├── cloud-eureka-server
│   │   ├── cloud-eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudeurekaserver
│   │   │       │               └── CloudEurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudeurekaserver
│   │       │               └── CloudEurekaServerApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── cloud-grpc-client
│   │   ├── cloud-grpc-client.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudgrpcclient
│   │   │       │               ├── CloudGrpcClientApplication.java
│   │   │       │               ├── GlobalClientInterceptorConfiguration.java
│   │   │       │               ├── GrpcClientController.java
│   │   │       │               ├── GrpcClientService.java
│   │   │       │               └── LogGrpcInterceptor.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudgrpcclient
│   │       │               ├── CloudGrpcClientApplication.class
│   │       │               ├── GlobalClientInterceptorConfiguration$1.class
│   │       │               ├── GlobalClientInterceptorConfiguration.class
│   │       │               ├── GrpcClientController.class
│   │       │               ├── GrpcClientService.class
│   │       │               └── LogGrpcInterceptor.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── cloud-grpc-server
│   │   ├── cloud-grpc-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudgrpcserver
│   │   │       │               ├── CloudGrpcServerApplication.java
│   │   │       │               ├── GlobalInterceptorConfiguration.java
│   │   │       │               ├── GrpcServerService.java
│   │   │       │               └── LogGrpcInterceptor.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudgrpcserver
│   │       │               ├── CloudGrpcServerApplication.class
│   │       │               ├── GlobalInterceptorConfiguration$1.class
│   │       │               ├── GlobalInterceptorConfiguration.class
│   │       │               ├── GrpcServerService.class
│   │       │               └── LogGrpcInterceptor.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── grpc-lib
│   │   ├── grpc-lib.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── proto
│   │   │           └── helloworld.proto
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── grpc
│   │       │   │           └── lib
│   │       │   │               ├── HelloReply$1.class
│   │       │   │               ├── HelloReply$Builder.class
│   │       │   │               ├── HelloReply.class
│   │       │   │               ├── HelloReplyOrBuilder.class
│   │       │   │               ├── HelloRequest$1.class
│   │       │   │               ├── HelloRequest$Builder.class
│   │       │   │               ├── HelloRequest.class
│   │       │   │               ├── HelloRequestOrBuilder.class
│   │       │   │               ├── HelloWorldProto$1.class
│   │       │   │               ├── HelloWorldProto.class
│   │       │   │               ├── SimpleGrpc$1.class
│   │       │   │               ├── SimpleGrpc$MethodHandlers.class
│   │       │   │               ├── SimpleGrpc$SimpleBlockingStub.class
│   │       │   │               ├── SimpleGrpc$SimpleDescriptorSupplier.class
│   │       │   │               ├── SimpleGrpc$SimpleFutureStub.class
│   │       │   │               ├── SimpleGrpc$SimpleImplBase.class
│   │       │   │               ├── SimpleGrpc$SimpleStub.class
│   │       │   │               └── SimpleGrpc.class
│   │       │   └── helloworld.proto
│   │       ├── generated-sources
│   │       │   ├── annotations
│   │       │   └── protobuf
│   │       │       ├── grpc-java
│   │       │       │   └── cn
│   │       │       │       └── springcloud
│   │       │       │           └── grpc
│   │       │       │               └── lib
│   │       │       │                   └── SimpleGrpc.java
│   │       │       └── java
│   │       │           └── cn
│   │       │               └── springcloud
│   │       │                   └── grpc
│   │       │                       └── lib
│   │       │                           ├── HelloReply.java
│   │       │                           ├── HelloReplyOrBuilder.java
│   │       │                           ├── HelloRequest.java
│   │       │                           ├── HelloRequestOrBuilder.java
│   │       │                           └── HelloWorldProto.java
│   │       ├── grpc-lib-0.0.1-SNAPSHOT.jar
│   │       ├── maven-archiver
│   │       │   └── pom.properties
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       ├── protoc-dependencies
│   │       │   └── 290dcf8941ab2ac716c165e32e5347f0
│   │       │       └── google
│   │       │           └── protobuf
│   │       │               ├── any.proto
│   │       │               ├── api.proto
│   │       │               ├── compiler
│   │       │               │   └── plugin.proto
│   │       │               ├── descriptor.proto
│   │       │               ├── duration.proto
│   │       │               ├── empty.proto
│   │       │               ├── field_mask.proto
│   │       │               ├── source_context.proto
│   │       │               ├── struct.proto
│   │       │               ├── timestamp.proto
│   │       │               ├── type.proto
│   │       │               └── wrappers.proto
│   │       └── protoc-plugins
│   │           ├── protoc-3.3.0-osx-x86_64.exe
│   │           └── protoc-gen-grpc-java-1.6.1-osx-x86_64.exe
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch21-1
│   ├── ch21-1-discovery-console
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── ConsoleApplication.java
│   │           └── resources
│   │               └── application.properties
│   ├── ch21-1-eureka-server
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── EurekaServerApplication.java
│   │           └── resources
│   │               ├── application.properties
│   │               └── logback.xml
│   ├── ch21-1-original-service
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DiscoveryApplicationA1.java
│   │           │               ├── DiscoveryApplicationA2.java
│   │           │               ├── DiscoveryApplicationB1.java
│   │           │               ├── DiscoveryApplicationB2.java
│   │           │               ├── DiscoveryApplicationC1.java
│   │           │               ├── DiscoveryApplicationC2.java
│   │           │               ├── DiscoveryApplicationC3.java
│   │           │               ├── extension
│   │           │               │   ├── MyDiscoveryEnabledAdapter.java
│   │           │               │   ├── MyDiscoveryListener.java
│   │           │               │   ├── MyLoadBalanceListener.java
│   │           │               │   ├── MyRegisterListener.java
│   │           │               │   └── MySubscriber.java
│   │           │               └── feign
│   │           │                   ├── AFeign.java
│   │           │                   ├── AFeignImpl.java
│   │           │                   ├── AbstractFeignImpl.java
│   │           │                   ├── BFeign.java
│   │           │                   ├── BFeignImpl.java
│   │           │                   ├── CFeign.java
│   │           │                   ├── CFeignImpl.java
│   │           │                   └── FeignConfiguration.java
│   │           └── resources
│   │               ├── application-a1.properties
│   │               ├── application-a2.properties
│   │               ├── application-b1.properties
│   │               ├── application-b2.properties
│   │               ├── application-c1.properties
│   │               ├── application-c2.properties
│   │               ├── application-c3.properties
│   │               ├── bootstrap.properties
│   │               ├── logback.xml
│   │               ├── rule.json
│   │               └── rule.xml
│   ├── ch21-1-zuul-server
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DiscoveryApplicationZuul.java
│   │           │               └── extension
│   │           │                   └── MyDiscoveryEnabledAdapter.java
│   │           └── resources
│   │               ├── application-zuul.properties
│   │               ├── bootstrap.properties
│   │               ├── logback.xml
│   │               ├── rule.json
│   │               └── rule.xml
│   └── pom.xml
├── ch21-3
│   ├── ch21-3-discovery-console
│   │   └── ch21-3-discovery-console.iml
│   ├── ch21-3-eureka-server
│   │   └── ch21-3-eureka-server.iml
│   ├── ch21-3-original-service
│   │   └── ch21-3-original-service.iml
│   ├── ch21-3-zuul-server
│   │   └── ch21-3-zuul-server.iml
│   └── ch21-3.iml
├── ch22-1
│   ├── ch22-1-2-dockerfile
│   │   ├── alpine-glibc
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java10
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java11
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java8
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   └── java9
│   │       ├── Dockerfile
│   │       └── README.MD
│   ├── ch22-1-3-jdk8-docker
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-1-3-jdk8-docker.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2213Jdk8DockerApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.properties
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2213Jdk8DockerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.properties
│   ├── ch22-1-4-jdk10-docker
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-1-4-jdk10-docker.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── Ch2214Jdk10DockerApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── ArgsController.java
│   │   │   │   └── resources
│   │   │   │       └── application.properties
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2214Jdk10DockerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.properties
│   ├── ch22-1.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-2
│   ├── ch22-2-1-config-server
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-1-config-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2221ConfigServerApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       └── db
│   │   │   │           ├── data.sql
│   │   │   │           └── schema.sql
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2221ConfigServerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── db
│   │               ├── data.sql
│   │               └── schema.sql
│   ├── ch22-2-2-eureka-server
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-2-eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2222EurekaServerApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2222EurekaServerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch22-2-3-gateway
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-3-gateway.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2223GatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2223GatewayApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-4-turbine
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-4-turbine.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2223TurbineApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2223TurbineApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-5-spring-admin
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-5-spring-admin.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2225SpringAdminApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2225SpringAdminApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-6-biz-service
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-6-biz-service.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2226BizServiceApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2226BizServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-3
│   ├── ch22-3-1
│   │   ├── k8s
│   │   │   ├── biz-service-rc.yml
│   │   │   ├── config-server-rc.yml
│   │   │   ├── config-server-svc.yml
│   │   │   ├── eureka-server-1-rc.yml
│   │   │   ├── eureka-server-1-svc.yml
│   │   │   ├── eureka-server-2-rc.yml
│   │   │   ├── eureka-server-2-svc.yml
│   │   │   ├── gateway-rc.yml
│   │   │   ├── gateway-svc.yml
│   │   │   ├── spring-admin-rc.yml
│   │   │   ├── spring-admin-svc.yml
│   │   │   ├── turbine-rc.yml
│   │   │   └── turbine-svc.yml
│   │   └── minikube
│   │       └── README.MD
│   ├── ch22-3-2-example-service
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-3-2-example-service.iml
│   │   ├── example-service-dm.yml
│   │   ├── example-service-hpa.yml
│   │   ├── example-service-rc.yml
│   │   ├── example-service-svc.yml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2232ExampleServiceApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2232ExampleServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch22-3-3-example-service
│   │   ├── Dockerfile
│   │   ├── ch22-3-3-example-service.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── Ch2233ExampleServiceApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── VersionController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2233ExampleServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch22-3.iml
│   ├── metrics-server-0.2.1
│   │   ├── README.MD
│   │   ├── auth-delegator.yaml
│   │   ├── auth-reader.yaml
│   │   ├── metrics-apiservice.yaml
│   │   ├── metrics-server-deployment.yaml
│   │   ├── metrics-server-service.yaml
│   │   └── resource-reader.yaml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-1
│   ├── ch23-1.iml
│   ├── demo-consumer
│   │   ├── demo-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   └── java
│   │       │       └── cn
│   │       │           └── springcloud
│   │       │               └── book
│   │       │                   └── ConsumerMain.java
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── AppTest.java
│   ├── demo-provider
│   │   ├── demo-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── service
│   │                               ├── HelloServiceImpl.java
│   │                               └── ProviderMain.java
│   ├── dubbo-provider-api
│   │   ├── dubbo-provider-api.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── HelloService.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-2
│   ├── ch23-2.iml
│   ├── demo-dubbo-consumer
│   │   ├── demo-dubbo-consumer.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── DemoDubboConsumerApplication.java
│   │       │   │               └── service
│   │       │   │                   └── DemoConsumer.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── DemoDubboConsumerApplicationTests.java
│   ├── demo-dubbo-provider
│   │   ├── demo-dubbo-provider.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DemoDubboProviderApplication.java
│   │           │               └── service
│   │           │                   └── HelloServiceImpl.java
│   │           └── resources
│   │               └── application.yml
│   ├── demo-dubbo-provider-api
│   │   ├── demo-dubbo-provider-api.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── service
│   │                               └── HelloService.java
│   ├── eureka-server
│   │   ├── eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── EurekaServerApplication.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch24
│   ├── ch24-jta-atomikos
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch24JtaAtomikosApplication.java
│   │       │   │               ├── config
│   │       │   │               │   ├── AtomikosJtaPlatform.java
│   │       │   │               │   ├── LogDatasourceConfig.java
│   │       │   │               │   └── OrderDatasourceConfig.java
│   │       │   │               ├── dao
│   │       │   │               │   ├── log
│   │       │   │               │   │   └── EventLogDao.java
│   │       │   │               │   └── order
│   │       │   │               │       └── UserOrderDao.java
│   │       │   │               ├── domain
│   │       │   │               │   ├── log
│   │       │   │               │   │   └── EventLog.java
│   │       │   │               │   └── order
│   │       │   │               │       └── UserOrder.java
│   │       │   │               └── service
│   │       │   │                   └── OrderService.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch24JtaAtomikosApplicationTests.java
│   ├── ch24-saga-servicecomb
│   │   ├── alpha-server
│   │   │   ├── README.MD
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   ├── schema-postgresql.sql
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               └── SagaAlphaServerApplication.java
│   │   │       │   └── resources
│   │   │       │       ├── application.yml
│   │   │       │       └── db
│   │   │       │           ├── data.sql
│   │   │       │           └── schema.sql
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── SagaAlphaServerApplicationTests.java
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── omega-inventory-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OmegaInventoryServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── InventoryController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── InventoryDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   └── Inventory.java
│   │   │       │   │               ├── dto
│   │   │       │   │               │   └── OrderRequest.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── InventoryService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OmegaInventoryServiceApplicationTests.java
│   │   ├── omega-order-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OmegaOrderServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── OrderController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── OrderDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   ├── OrderState.java
│   │   │       │   │               │   └── UserOrder.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── OrderService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OmegaOrderServiceApplicationTests.java
│   │   ├── pom.xml
│   │   └── saga-servicecomb-example
│   │       ├── mvnw
│   │       ├── mvnw.cmd
│   │       ├── pom.xml
│   │       └── src
│   │           ├── main
│   │           │   ├── java
│   │           │   │   └── cn
│   │           │   │       └── springcloud
│   │           │   │           └── book
│   │           │   │               ├── SagaServicecombExampleApplication.java
│   │           │   │               ├── config
│   │           │   │               │   └── RestConfig.java
│   │           │   │               ├── controller
│   │           │   │               │   └── SagaOrderController.java
│   │           │   │               └── dto
│   │           │   │                   └── OrderRequest.java
│   │           │   └── resources
│   │           │       └── application.yml
│   │           └── test
│   │               └── java
│   │                   └── cn
│   │                       └── springcloud
│   │                           └── book
│   │                               └── SagaServicecombExampleApplicationTests.java
│   ├── ch24-tcc-rest
│   │   ├── inventory-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── InventoryServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── InventoryController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   ├── FrozeRequestDao.java
│   │   │       │   │               │   └── InventoryDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   ├── FrozeRequest.java
│   │   │       │   │               │   └── Inventory.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── FrozeService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── InventoryServiceApplicationTests.java
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── order-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OrderServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── OrderController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── OrderDao.java
│   │   │       │   │               └── domain
│   │   │       │   │                   ├── OrderState.java
│   │   │       │   │                   └── UserOrder.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OrderServiceApplicationTests.java
│   │   ├── pom.xml
│   │   ├── tcc-coordinator-atomikos
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── TccCoordinatorAtomikosApplication.java
│   │   │       │   │               ├── config
│   │   │       │   │               │   └── AtomikosTccConfig.java
│   │   │       │   │               └── controller
│   │   │       │   │                   └── TccCoordinatorController.java
│   │   │       │   └── resources
│   │   │       │       ├── application.yml
│   │   │       │       └── logback.xml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── TccCoordinatorAtomikosApplicationTests.java
│   │   ├── tcc-coordinator-example
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── TccCoordinatorExampleApplication.java
│   │   │       │   │               ├── config
│   │   │       │   │               │   └── RestConfig.java
│   │   │       │   │               ├── dto
│   │   │       │   │               │   ├── FrozeRequest.java
│   │   │       │   │               │   └── OrderRequest.java
│   │   │       │   │               └── service
│   │   │       │   │                   ├── TccCoordinatorClient.java
│   │   │       │   │                   └── TccOrderService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── TccCoordinatorExampleApplicationTests.java
│   │   └── tcc-rest-participant-api
│   │       ├── pom.xml
│   │       └── src
│   │           ├── main
│   │           │   └── java
│   │           │       └── cn
│   │           │           └── springcloud
│   │           │               └── book
│   │           │                   └── controller
│   │           │                       └── TccParticipantController.java
│   │           └── test
│   │               └── java
│   │                   └── cn
│   │                       └── springcloud
│   │                           └── book
│   │                               └── AppTest.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch24-3
│   ├── ch24-3-1-jta-atomikos
│   │   └── ch24-3-1-jta-atomikos.iml
│   ├── ch24-3-2-tcc-rest
│   │   ├── ch24-3-2-tcc-rest.iml
│   │   ├── inventory-service
│   │   │   └── inventory-service.iml
│   │   ├── order-service
│   │   │   └── order-service.iml
│   │   ├── tcc-coordinator-atomikos
│   │   │   └── tcc-coordinator-atomikos.iml
│   │   ├── tcc-coordinator-example
│   │   │   └── tcc-coordinator-example.iml
│   │   └── tcc-rest-participant-api
│   │       └── tcc-rest-participant-api.iml
│   └── ch24-3.iml
├── ch25
│   ├── LICENSE
│   ├── README.md
│   ├── ch25.iml
│   ├── crm-sales-app
│   │   ├── crm-sales-app.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   └── java
│   │   │   │       └── cn
│   │   │   │           └── springcloud
│   │   │   │               └── book
│   │   │   │                   └── crm
│   │   │   │                       └── sales
│   │   │   │                           ├── assembler
│   │   │   │                           │   └── CustomerAssembler.java
│   │   │   │                           ├── command
│   │   │   │                           │   ├── CustomerAddCmdExe.java
│   │   │   │                           │   ├── CustomerCheckConflictCmdExe.java
│   │   │   │                           │   ├── extension
│   │   │   │                           │   │   ├── CustomerSearchConditionCGSExt.java
│   │   │   │                           │   │   ├── CustomerSearchConditionExt.java
│   │   │   │                           │   │   └── CustomerSearchConditionTPExt.java
│   │   │   │                           │   ├── extensionpoint
│   │   │   │                           │   │   └── CustomerCheckConflictSearchConditionExtPt.java
│   │   │   │                           │   └── query
│   │   │   │                           │       └── CustomerFindByCriteriaQueryExe.java
│   │   │   │                           ├── event
│   │   │   │                           │   └── handler
│   │   │   │                           │       └── CustomerChangeEventHandler.java
│   │   │   │                           ├── interceptor
│   │   │   │                           │   ├── HaloContextPostInterceptor.java
│   │   │   │                           │   ├── HaloContextPreInterceptor.java
│   │   │   │                           │   ├── LoggerPostInterceptor.java
│   │   │   │                           │   ├── LoggerPreInterceptor.java
│   │   │   │                           │   └── ValidationInterceptor.java
│   │   │   │                           ├── service
│   │   │   │                           │   └── CustomerServiceImpl.java
│   │   │   │                           └── validator
│   │   │   │                               ├── CustomerAddValidator.java
│   │   │   │                               ├── extension
│   │   │   │                               │   ├── CustomerAddCGSValidator.java
│   │   │   │                               │   └── CustomerAddDDValidator.java
│   │   │   │                               └── extensionpoint
│   │   │   │                                   └── CustomerAddValidatorExtPt.java
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── assembler
│   │       │                       │   └── CustomerAssembler.class
│   │       │                       ├── command
│   │       │                       │   ├── CustomerAddCmdExe.class
│   │       │                       │   ├── CustomerCheckConflictCmdExe.class
│   │       │                       │   ├── extension
│   │       │                       │   │   ├── CustomerSearchConditionCGSExt.class
│   │       │                       │   │   ├── CustomerSearchConditionExt.class
│   │       │                       │   │   └── CustomerSearchConditionTPExt.class
│   │       │                       │   ├── extensionpoint
│   │       │                       │   │   └── CustomerCheckConflictSearchConditionExtPt.class
│   │       │                       │   └── query
│   │       │                       │       └── CustomerFindByCriteriaQueryExe.class
│   │       │                       ├── event
│   │       │                       │   └── handler
│   │       │                       │       └── CustomerChangeEventHandler.class
│   │       │                       ├── interceptor
│   │       │                       │   ├── HaloContextPostInterceptor.class
│   │       │                       │   ├── HaloContextPreInterceptor.class
│   │       │                       │   ├── LoggerPostInterceptor.class
│   │       │                       │   ├── LoggerPreInterceptor.class
│   │       │                       │   └── ValidationInterceptor.class
│   │       │                       ├── service
│   │       │                       │   └── CustomerServiceImpl.class
│   │       │                       └── validator
│   │       │                           ├── CustomerAddValidator.class
│   │       │                           ├── extension
│   │       │                           │   ├── CustomerAddCGSValidator.class
│   │       │                           │   └── CustomerAddDDValidator.class
│   │       │                           └── extensionpoint
│   │       │                               └── CustomerAddValidatorExtPt.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-client
│   │   ├── crm-sales-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── crm
│   │   │                           └── sales
│   │   │                               ├── api
│   │   │                               │   └── CustomerServiceI.java
│   │   │                               └── dto
│   │   │                                   ├── CustomerAddCmd.java
│   │   │                                   ├── CustomerCheckConflictCmd.java
│   │   │                                   ├── CustomerFindByCriteriaQry.java
│   │   │                                   ├── CustomerFindByNameQry.java
│   │   │                                   ├── CustomerUpdateCmd.java
│   │   │                                   └── clientobject
│   │   │                                       ├── CustomerCO.java
│   │   │                                       ├── CustomerType.java
│   │   │                                       ├── LeadCO.java
│   │   │                                       ├── OppertunityCO.java
│   │   │                                       └── QueryCriteria.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── api
│   │       │                       │   └── CustomerServiceI.class
│   │       │                       └── dto
│   │       │                           ├── CustomerAddCmd.class
│   │       │                           ├── CustomerCheckConflictCmd.class
│   │       │                           ├── CustomerFindByCriteriaQry.class
│   │       │                           ├── CustomerFindByNameQry.class
│   │       │                           ├── CustomerUpdateCmd.class
│   │       │                           └── clientobject
│   │       │                               ├── CustomerCO.class
│   │       │                               ├── CustomerType.class
│   │       │                               ├── LeadCO.class
│   │       │                               ├── OppertunityCO.class
│   │       │                               └── QueryCriteria.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-consumer
│   │   ├── crm-sales-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       ├── ConsumerApplication.java
│   │   │       │                       └── CustomerController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── ConsumerApplication.class
│   │       │                       └── CustomerController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-domain
│   │   ├── crm-sales-domain.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       └── domain
│   │   │       │                           └── customer
│   │   │       │                               ├── convertor
│   │   │       │                               │   ├── CustomerConvertor.java
│   │   │       │                               │   ├── extension
│   │   │       │                               │   │   ├── CustomerCGSConvertorExt.java
│   │   │       │                               │   │   └── CustomerDDConvertorExt.java
│   │   │       │                               │   └── extensionpoint
│   │   │       │                               │       └── CustomerConvertorExtPt.java
│   │   │       │                               ├── entity
│   │   │       │                               │   ├── ContactE.java
│   │   │       │                               │   ├── CustomerE.java
│   │   │       │                               │   └── OpportunityE.java
│   │   │       │                               ├── factory
│   │   │       │                               │   └── CustomerDomainFactory.java
│   │   │       │                               ├── repository
│   │   │       │                               │   ├── ContactRepository.java
│   │   │       │                               │   └── CustomerRepository.java
│   │   │       │                               ├── rule
│   │   │       │                               │   ├── extension
│   │   │       │                               │   │   ├── CustomerCGSRuleExt.java
│   │   │       │                               │   │   └── CustomerDDRuleExt.java
│   │   │       │                               │   └── extensionpoint
│   │   │       │                               │       └── CustomerRuleExtPt.java
│   │   │       │                               └── valueobject
│   │   │       │                                   ├── AddressV.java
│   │   │       │                                   ├── CompanyType.java
│   │   │       │                                   └── SourceType.java
│   │   │       └── resources
│   │   │           └── sample.properties
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── crm
│   │       │   │               └── sales
│   │       │   │                   └── domain
│   │       │   │                       └── customer
│   │       │   │                           ├── convertor
│   │       │   │                           │   ├── CustomerConvertor.class
│   │       │   │                           │   ├── extension
│   │       │   │                           │   │   ├── CustomerCGSConvertorExt.class
│   │       │   │                           │   │   └── CustomerDDConvertorExt.class
│   │       │   │                           │   └── extensionpoint
│   │       │   │                           │       └── CustomerConvertorExtPt.class
│   │       │   │                           ├── entity
│   │       │   │                           │   ├── ContactE.class
│   │       │   │                           │   ├── CustomerE.class
│   │       │   │                           │   └── OpportunityE.class
│   │       │   │                           ├── factory
│   │       │   │                           │   └── CustomerDomainFactory.class
│   │       │   │                           ├── repository
│   │       │   │                           │   ├── ContactRepository.class
│   │       │   │                           │   └── CustomerRepository.class
│   │       │   │                           ├── rule
│   │       │   │                           │   ├── extension
│   │       │   │                           │   │   ├── CustomerCGSRuleExt.class
│   │       │   │                           │   │   └── CustomerDDRuleExt.class
│   │       │   │                           │   └── extensionpoint
│   │       │   │                           │       └── CustomerRuleExtPt.class
│   │       │   │                           └── valueobject
│   │       │   │                               ├── AddressV.class
│   │       │   │                               ├── CompanyType.class
│   │       │   │                               └── SourceType.class
│   │       │   └── sample.properties
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-infrastructure
│   │   ├── crm-sales-infrastructure.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       ├── common
│   │   │       │                       │   ├── AppConstants.java
│   │   │       │                       │   └── BizCode.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── HaloConfig.java
│   │   │       │                       ├── dao
│   │   │       │                       │   └── CustomerDOMapper.java
│   │   │       │                       └── tunnel
│   │   │       │                           ├── dataobject
│   │   │       │                           │   └── CustomerDO.java
│   │   │       │                           └── datatunnel
│   │   │       │                               ├── CustomerTunnelI.java
│   │   │       │                               └── impl
│   │   │       │                                   └── CustomerDBTunnel.java
│   │   │       └── resources
│   │   │           ├── customer.sql
│   │   │           └── mapper
│   │   │               └── CustomerDOMapper.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── crm
│   │       │   │               └── sales
│   │       │   │                   ├── common
│   │       │   │                   │   ├── AppConstants.class
│   │       │   │                   │   └── BizCode.class
│   │       │   │                   ├── config
│   │       │   │                   │   └── HaloConfig.class
│   │       │   │                   ├── dao
│   │       │   │                   │   └── CustomerDOMapper.class
│   │       │   │                   └── tunnel
│   │       │   │                       ├── dataobject
│   │       │   │                       │   └── CustomerDO.class
│   │       │   │                       └── datatunnel
│   │       │   │                           ├── CustomerTunnelI.class
│   │       │   │                           └── impl
│   │       │   │                               └── CustomerDBTunnel.class
│   │       │   ├── customer.sql
│   │       │   └── mapper
│   │       │       └── CustomerDOMapper.xml
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-start
│   │   ├── crm-sales-start.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       └── CrmSalesApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       └── CrmSalesApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── pom.xml
│   └── tree.md
├── ch3-1
│   ├── ch3-1-config-server
│   │   ├── README.MD
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch31ConfigServerApplication.java
│   │       │   └── resources
│   │       │       ├── bootstrap.yml
│   │       │       └── config
│   │       │           ├── eureka-client.yml
│   │       │           ├── eureka-server-peer1.yml
│   │       │           ├── eureka-server-peer2.yml
│   │       │           └── eureka-server-peer3.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31ConfigServerApplicationTests.java
│   ├── ch3-1-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch31EurekaClientApplication.java
│   │       │   │               └── controller
│   │       │   │                   └── QueryController.java
│   │       │   └── resources
│   │       │       ├── application.yml
│   │       │       └── bootstrap.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31EurekaClientApplicationTests.java
│   ├── ch3-1-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch31EurekaServerApplication.java
│   │       │   │               └── controller
│   │       │   │                   └── QueryController.java
│   │       │   └── resources
│   │       │       ├── application.yml
│   │       │       └── bootstrap.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-2
│   ├── ch3-2-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch32EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch32EurekaClientApplicationTests.java
│   ├── ch3-2-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch322EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1a.yml
│   │       │       ├── application-zone1b.yml
│   │       │       ├── application-zone2a.yml
│   │       │       ├── application-zone2b.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch322EurekaServerApplicationTests.java
│   ├── ch3-2-zuul-gateway
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch322ZuulGatewayApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch322ZuulGatewayApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-3
│   ├── ch3-3-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch33EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       ├── application-zone3.yml
│   │       │       ├── application-zone4.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33EurekaClientApplicationTests.java
│   ├── ch3-3-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch33EurkeaServerApplication.java
│   │       │   │               └── config
│   │       │   │                   └── RegionConfig.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       ├── application-zone3-region-west.yml
│   │       │       └── application-zone4-region-west.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33EurkeaServerApplicationTests.java
│   ├── ch3-3-zuul-gateway
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch33ZuulGatewayApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone3-region-west.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33ZuulGatewayApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-4
│   ├── ch3-4-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch34EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-security.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch34EurekaClientApplicationTests.java
│   ├── ch3-4-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch34EurkeaServerApplication.java
│   │       │   │               └── config
│   │       │   │                   └── SecurityConfig.java
│   │       │   └── resources
│   │       │       ├── application-security.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch34EurkeaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-5
│   ├── ch3-5-1-config-server
│   │   ├── ch3-5-1-config-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── config
│   │               ├── eureka-client.yml
│   │               ├── eureka-server-peer1.yml
│   │               ├── eureka-server-peer2.yml
│   │               └── eureka-server-peer3.yml
│   ├── ch3-5-1-eureka-client
│   │   ├── ch3-5-1-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch3-5-1-eureka-server
│   │   ├── ch3-5-1-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch3-5-2-eureka-client
│   │   ├── ch3-5-2-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           └── application.yml
│   ├── ch3-5-2-eureka-server
│   │   ├── ch3-5-2-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1a.yml
│   │           ├── application-zone1b.yml
│   │           ├── application-zone2a.yml
│   │           ├── application-zone2b.yml
│   │           └── application.yml
│   ├── ch3-5-2-zuul-gateway
│   │   ├── ch3-5-2-zuul-gateway.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           └── application.yml
│   ├── ch3-5-3-eureka-client
│   │   ├── ch3-5-3-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           ├── application-zone3.yml
│   │           ├── application-zone4.yml
│   │           └── application.yml
│   ├── ch3-5-3-eureka-server
│   │   ├── ch3-5-3-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           ├── application-zone3-region-west.yml
│   │           └── application-zone4-region-west.yml
│   ├── ch3-5-4-eureka-client
│   │   ├── ch3-5-4-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-security.yml
│   │           └── application.yml
│   ├── ch3-5-4-eureka-server
│   │   ├── ch3-5-4-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-security.yml
│   │           └── application.yml
│   ├── ch3-5-5-eureka-client
│   │   ├── ch3-5-5-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-https.yml
│   │           ├── application.yml
│   │           ├── client.crt
│   │           ├── client.p12
│   │           └── server.crt
│   ├── ch3-5-5-eureka-server
│   │   ├── ch3-5-5-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-https.yml
│   │           ├── application.yml
│   │           ├── client.crt
│   │           ├── server.crt
│   │           └── server.p12
│   ├── ch3-5-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch35EurekaClientApplication.java
│   │       │   │               └── config
│   │       │   │                   └── EurekaHttpsClientConfig.java
│   │       │   └── resources
│   │       │       ├── application-https.yml
│   │       │       ├── application.yml
│   │       │       ├── client.crt
│   │       │       ├── client.p12
│   │       │       └── server.crt
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch35EurekaClientApplicationTests.java
│   ├── ch3-5-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch35EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-https.yml
│   │       │       ├── application.yml
│   │       │       ├── client.crt
│   │       │       ├── server.crt
│   │       │       └── server.p12
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch35EurekaServerApplicationTests.java
│   ├── ch3-5.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch4-1
│   ├── ch4-1-gzip
│   │   ├── ch4-1-gzip.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── HelloFeignServiceConfig.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-1-hello
│   │   ├── ch4-1-hello.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── HelloFeignServiceConfig.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-1.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-2
│   ├── ch4-2-consumer
│   │   ├── ch4-2-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── ConsumerApplication.java
│   │   │   │   │                   ├── config
│   │   │   │   │                   │   ├── CoreAutoConfiguration.java
│   │   │   │   │                   │   └── FeignRequestInterceptor.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── ConsumerController.java
│   │   │   │   │                   ├── model
│   │   │   │   │                   │   └── OrderModel.java
│   │   │   │   │                   └── service
│   │   │   │   │                       └── UserFeignService.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-2-eureka-server
│   │   ├── ch4-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch4-2-provider
│   │   ├── ch4-2-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── ProviderApplication.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── OrderProviderController.java
│   │   │   │   │                   └── model
│   │   │   │   │                       └── OrderModel.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-2.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-3
│   ├── ch4-3-httpclient
│   │   ├── ch4-3-httpclient.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-3-okhttp
│   │   ├── ch4-3-okhttp.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── SpringCloudFeignApplication.java
│   │   │   │   │                   ├── config
│   │   │   │   │                   │   └── FeignOkHttpConfig.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── HelloFeignController.java
│   │   │   │   │                   └── service
│   │   │   │   │                       └── HelloFeignService.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-3.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-4
│   ├── ch4-4-eureka-server
│   │   ├── ch4-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4-feign-file-server
│   │   ├── ch4-4-feign-file-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SCFeignFileServerApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── FeignUploadController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── SCFeignFileServerApplication.class
│   │       │                   └── controller
│   │       │                       └── FeignUploadController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4-feign-upload-client
│   │   ├── ch4-4-feign-upload-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SCFeignFileUploadApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   ├── FeignMultipartSupportConfig.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── FeignUploadController.java
│   │   │       │                   └── service
│   │   │       │                       └── FileUploadFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── SCFeignFileUploadApplication.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   ├── FeignMultipartSupportConfig.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   ├── controller
│   │       │                   │   └── FeignUploadController.class
│   │       │                   └── service
│   │       │                       └── FileUploadFeignService.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-5
│   ├── ch4-5-consumer
│   │   ├── ch4-5-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ConsumerApplication.java
│   │   │       │                   ├── Interceptor
│   │   │       │                   │   ├── FeignRequestInterceptor.java
│   │   │       │                   │   └── FeignTokenInterceptor.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   ├── model
│   │   │       │                   │   └── User.java
│   │   │       │                   └── service
│   │   │       │                       └── UserFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ConsumerApplication.class
│   │       │                   ├── Interceptor
│   │       │                   │   ├── FeignRequestInterceptor.class
│   │       │                   │   └── FeignTokenInterceptor.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   ├── model
│   │       │                   │   └── User.class
│   │       │                   └── service
│   │       │                       └── UserFeignService.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5-eureka-server
│   │   ├── ch4-5-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5-provider
│   │   ├── ch4-5-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ProviderApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   └── model
│   │       │                       └── User.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-6
│   ├── ch4-6-consumer
│   │   ├── ch4-6-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ConsumerApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   └── controller
│   │   │       │                       └── UserController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ConsumerApplication.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   └── controller
│   │       │                       └── UserController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-eureka-server
│   │   ├── ch4-6-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-provider
│   │   ├── ch4-6-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ProviderApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   └── model
│   │       │                       └── User.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-provider-client
│   │   ├── ch4-6-provider-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── model
│   │   │       │                   │   └── User.java
│   │   │       │                   └── service
│   │   │       │                       └── UserService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── model
│   │       │                   │   └── User.class
│   │       │                   └── service
│   │       │                       └── UserService.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6.iml
│   ├── pom.xml
│   └── readme.md
├── ch5-1
│   ├── ch5-1-client-a
│   │   ├── ch5-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1-eureka-server
│   │   ├── ch5-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1-ribbon-loadbalancer
│   │   ├── ch5-1-ribbon-loadbalancer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── RibbonLoadbalancerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1.iml
│   └── pom.xml
├── ch5-2
│   ├── ch5-2-client-a
│   │   ├── ch5-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2-eureka-server
│   │   ├── ch5-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2-ribbon-loadbalancer
│   │   ├── ch5-2-ribbon-loadbalancer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── RibbonLoadbalancerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   ├── AvoidScan.java
│   │   │       │               │   └── TestConfiguration.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2.iml
│   └── pom.xml
├── ch6-1
│   ├── ch6-1-client-service
│   │   ├── ch6-1-client-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── TestController.java
│   │   │       │               └── service
│   │   │       │                   ├── IUserService.java
│   │   │       │                   └── impl
│   │   │       │                       └── UserService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-1-eureka-server
│   │   ├── ch6-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-1.iml
│   └── pom.xml
├── ch6-2
│   ├── ch6-2-consumer-service
│   │   ├── ch6-2-consumer-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ConsumerApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── TestController.java
│   │   │       │               └── service
│   │   │       │                   ├── IUserService.java
│   │   │       │                   └── impl
│   │   │       │                       └── UserServiceFallback.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-2-eureka-server
│   │   ├── ch6-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-2-provider-service
│   │   ├── ch6-2-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ProviderApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-2.iml
│   └── pom.xml
├── ch6-3
│   ├── ch6-3-eureka-server
│   │   ├── ch6-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-3-hello-service
│   │   ├── ch6-3-hello-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── hello
│   │   │       │                   ├── HelloServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloController.java
│   │   │       │                   └── service
│   │   │       │                       ├── IHelloService.java
│   │   │       │                       ├── dataservice
│   │   │       │                       │   └── ProviderService.java
│   │   │       │                       └── impl
│   │   │       │                           └── HelloService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-hystrix-dashboard
│   │   ├── ch6-3-hystrix-dashboard.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── HystrixDashboardApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-hystrix-exception-service
│   │   ├── ch6-3-hystrix-exception-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ex
│   │   │       │                   ├── HystrixExceptionApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── ExceptionController.java
│   │   │       │                   └── service
│   │   │       │                       └── dataservice
│   │   │       │                           ├── FeignErrorDecoder.java
│   │   │       │                           ├── PSFallbackBadRequestExpcetion.java
│   │   │       │                           ├── PSFallbackOtherExpcetion.java
│   │   │       │                           └── ProviderServiceCommand.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-provider-service
│   │   ├── ch6-3-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── provider
│   │   │       │                   ├── ProviderServiceApplication.java
│   │   │       │                   └── controller
│   │   │       │                       ├── ConsumerService.java
│   │   │       │                       └── ProviderController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-turbine
│   │   ├── ch6-3-turbine.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── TurbineApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3.iml
│   └── pom.xml
├── ch6-4
│   ├── ch6-4-collapsing
│   │   ├── ch6-4-collapsing.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── hystrix
│   │           │               │   ├── HystrixCollapsingApplication.java
│   │           │               │   ├── config
│   │           │               │   │   ├── CollapsingConfiguration.java
│   │           │               │   │   └── HystrixContextInterceptor.java
│   │           │               │   ├── controller
│   │           │               │   │   └── CollapsingController.java
│   │           │               │   └── service
│   │           │               │       ├── CollapsingService.java
│   │           │               │       └── ICollapsingService.java
│   │           │               └── provider
│   │           │                   └── model
│   │           │                       └── Animal.java
│   │           └── resources
│   │               ├── application.yml
│   │               └── bootstrap.yml
│   ├── ch6-4-eureka-server
│   │   ├── ch6-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-4-hystrix-cache
│   │   ├── ch6-4-hystrix-cache.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── hystrix
│   │   │       │                   ├── HystrixCacheApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── CacheConfiguration.java
│   │   │       │                   │   └── CacheContextInterceptor.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── CacheController.java
│   │   │       │                   └── service
│   │   │       │                       ├── HelloCommand.java
│   │   │       │                       ├── HelloService.java
│   │   │       │                       └── IHelloService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-4-hystrix-thread-context
│   │   ├── ch6-4-hystrix-thread-context.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── hystrix
│   │           │                   ├── HystrixThreadContextApplication.java
│   │           │                   ├── config
│   │           │                   │   ├── HystrixThreadCallable.java
│   │           │                   │   ├── HystrixThreadContextConfiguration.java
│   │           │                   │   ├── HystrixThreadLocal.java
│   │           │                   │   └── SpringCloudHystrixConcurrencyStrategy.java
│   │           │                   ├── controller
│   │           │                   │   └── ThreadContextController.java
│   │           │                   └── service
│   │           │                       ├── IThreadContextService.java
│   │           │                       └── ThreadContextService.java
│   │           └── resources
│   │               ├── application.yml
│   │               └── bootstrap.yml
│   ├── ch6-4-provider-service
│   │   ├── ch6-4-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── provider
│   │   │       │                   ├── ProviderServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── ProviderController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-4.iml
│   └── pom.xml
├── ch7-1
│   ├── ch7-1-client-a
│   │   ├── ch7-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ClientAApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch7-1-eureka-server
│   │   ├── ch7-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-1-zuul-server
│   │   ├── ch7-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch7-2
│   ├── ch7-2-client-a
│   │   ├── ch7-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch7-2-eureka-server
│   │   ├── ch7-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-2-zuul-server
│   │   ├── ch7-2-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-2.iml
│   └── pom.xml
├── ch7-3
│   ├── ch7-3-client-a
│   │   ├── ch7-3-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-client-b
│   │   ├── ch7-3-client-b.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientBApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-eureka-server
│   │   ├── ch7-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-zuul-server
│   │   ├── ch7-3-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── application-example1.yml
│   │   │           ├── application-example2.yml
│   │   │           ├── application-example3.yml
│   │   │           ├── application-example4.yml
│   │   │           ├── application-example5.yml
│   │   │           ├── application-example6.yml
│   │   │           ├── application-example7.yml
│   │   │           ├── application-example8.yml
│   │   │           ├── application-example9.yml
│   │   │           ├── application.yml
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application-example1.yml
│   │           ├── application-example2.yml
│   │           ├── application-example3.yml
│   │           ├── application-example4.yml
│   │           ├── application-example5.yml
│   │           ├── application-example6.yml
│   │           ├── application-example7.yml
│   │           ├── application-example8.yml
│   │           ├── application-example9.yml
│   │           ├── application.yml
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3.iml
│   └── pom.xml
├── ch8-1
│   ├── ch8-1-client-a
│   │   ├── ch8-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch8-1-eureka-server
│   │   ├── ch8-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-1-zuul-server
│   │   ├── ch8-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── SecurityConfiguration.java
│   │   │       │               ├── filter
│   │   │       │               │   ├── ErrorFilter.java
│   │   │       │               │   ├── FirstPreFilter.java
│   │   │       │               │   ├── PostFilter.java
│   │   │       │               │   ├── SecondPreFilter.java
│   │   │       │               │   └── ThirdPreFilter.java
│   │   │       │               └── groovy
│   │   │       │                   └── GroovyFilter.groovy
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-1.iml
│   └── pom.xml
├── ch8-2
│   ├── ch8-2-auth-server
│   │   ├── ch8-2-auth-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── AuthServerApplication.java
│   │   │       │               └── OAuthConfiguration.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-client-a
│   │   ├── ch8-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-eureka-server
│   │   ├── ch8-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-zuul-server
│   │   ├── ch8-2-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2.iml
│   └── pom.xml
├── ch8-3
│   ├── ch8-3-client-a
│   │   ├── ch8-3-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3-eureka-server
│   │   ├── ch8-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3-zuul-server
│   │   ├── ch8-3-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3.iml
│   └── pom.xml
├── ch8-4
│   ├── ch8-4-client-a
│   │   ├── ch8-4-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4-eureka-server
│   │   ├── ch8-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4-zuul-server
│   │   ├── ch8-4-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── DynamicZuulRouteLocator.java
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── DynamicZuulConfig.java
│   │   │       │               ├── dao
│   │   │       │               │   └── PropertiesDao.java
│   │   │       │               └── entity
│   │   │       │                   └── ZuulRouteEntity.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4.iml
│   ├── mysql.sql
│   └── pom.xml
├── ch8-5
│   ├── ch8-5-client-a
│   │   ├── ch8-5-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5-eureka-server
│   │   ├── ch8-5-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5-zuul-server
│   │   ├── ch8-5-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   └── GrayFilter.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5.iml
│   └── pom.xml
├── ch8-6
│   ├── ch8-6-eureka-server
│   │   ├── ch8-6-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-6-zuul-server
│   │   ├── ch8-6-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── ZuulUploadController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-6.iml
│   └── pom.xml
├── ch8-7
│   ├── ch8-7-client-a
│   │   ├── ch8-7-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7-eureka-server
│   │   ├── ch8-7-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7-zuul-server
│   │   ├── ch8-7-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   ├── ApplicationExceptionAdapter.java
│   │   │       │               │   └── SwaggerConfig.java
│   │   │       │               └── filter
│   │   │       │                   ├── HeaderDeliverFilter.java
│   │   │       │                   └── ModifyRequestEntityFilter.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7.iml
│   └── pom.xml
└── pom.xml

3922 directories, 2581 files
xujindeMacBook-Pro:spring-cloud-code xujin$ clear

xujindeMacBook-Pro:spring-cloud-code xujin$ tree>>tree.txt
xujindeMacBook-Pro:spring-cloud-code xujin$ 







































































xujindeMacBook-Pro:spring-cloud-code xujin$ tree
.
├── LICENSE
├── README.md
├── ch10-1
│   ├── ch10-1-common
│   │   ├── ch10-1-common.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── common
│   │   │       │                   ├── config
│   │   │       │                   │   └── CommonConfiguration.java
│   │   │       │                   ├── context
│   │   │       │                   │   ├── HystrixThreadCallable.java
│   │   │       │                   │   ├── HystrixThreadLocal.java
│   │   │       │                   │   ├── SpringCloudHystrixConcurrencyStrategy.java
│   │   │       │                   │   ├── SpringContextManager.java
│   │   │       │                   │   └── UserContextHolder.java
│   │   │       │                   ├── exception
│   │   │       │                   │   ├── BaseException.java
│   │   │       │                   │   ├── BaseExceptionBody.java
│   │   │       │                   │   └── CommonError.java
│   │   │       │                   ├── intercepter
│   │   │       │                   │   ├── FeignUserContextInterceptor.java
│   │   │       │                   │   ├── RestTemplateUserContextInterceptor.java
│   │   │       │                   │   └── UserContextInterceptor.java
│   │   │       │                   ├── util
│   │   │       │                   │   ├── AuthUtil.java
│   │   │       │                   │   ├── ExceptionUtil.java
│   │   │       │                   │   └── HttpConvertUtil.java
│   │   │       │                   └── vo
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── logback.xml
│   ├── ch10-1-config-server
│   │   ├── ch10-1-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch10-1-data-service
│   │   ├── ch10-1-data-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── dataservice
│   │   │       │                   ├── DataServiceApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── DataConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── DataController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-eureka-server
│   │   ├── ch10-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch10-1-hystrix-dashboard
│   │   ├── ch10-1-hystrix-dashboard.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── HystrixDashboardTurbineApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-user-service
│   │   ├── ch10-1-user-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── user
│   │   │       │                   ├── UserServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── service
│   │   │       │                       ├── IUserService.java
│   │   │       │                       ├── dataservice
│   │   │       │                       │   └── DataService.java
│   │   │       │                       ├── fallback
│   │   │       │                       │   └── UserClientFallback.java
│   │   │       │                       └── impl
│   │   │       │                           └── UserService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1-zuul-server
│   │   ├── ch10-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   ├── AuthFilter.java
│   │   │       │                   └── ZuulFallback.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch10-1.iml
│   └── pom.xml
├── ch11-1
│   ├── ch11-1-config-client
│   │   ├── ch11-1-client-config.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-1-config-server
│   │   ├── ch11-1-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch11-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch11-2
│   ├── ch11-2-config-client-refresh
│   │   ├── ch11-2-config-client-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-2-config-server
│   │   ├── ch11-2-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch11-2.iml
│   └── pom.xml
├── ch11-3
│   ├── ch11-3-config-client-bus-refresh
│   │   ├── ch11-3-config-client-bus-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-3-config-client-bus-refresh-second
│   │   ├── ch11-3-config-client-bus-refresh-second.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   ├── ConfigInfoProperties.java
│   │   │       │                       │   └── SecurityConfiguration.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch11-3-config-server-bus
│   │   ├── ch11-3-config-server-bus.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── GitConfigServerApplication.java
│   │   │       │                   └── SecurityConfiguration.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── application.yml
│   ├── ch11-3.iml
│   └── pom.xml
├── ch12-1
│   ├── ch12-1-config-client-placeholders
│   │   ├── ch12-1-config-client-placeholders.iml
│   │   ├── config-client-placeholders.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-1-config-server-placeholders
│   │   ├── ch12-1-config-server-placeholders.iml
│   │   ├── config-server-placeholders.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── GitConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-1.iml
│   └── pom.xml
├── ch12-10
│   ├── ch12-10-config-client-apollo
│   │   ├── ch12-10-config-client-apollo.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ApolloClientApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── AppConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10-config-client-apollo2
│   │   ├── ch12-10-config-client-apollo2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ApolloClientApplicationNew.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── AppConfig.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10-eureka-server
│   │   ├── ch12-10-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-10-gateway-zuul-apollo
│   │   ├── ch12-10-gateway-zuul-apollo.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── zuul
│   │   │       │                   ├── ZuulServerApplication.java
│   │   │       │                   └── config
│   │   │       │                       └── ZuulPropertiesRefresher.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── app.properties
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── app.properties
│   │           └── application.yml
│   ├── ch12-10.iml
│   └── pom.xml
├── ch12-2
│   ├── ch12-2-config-client-multiple-repositories
│   │   ├── ch12-2-config-client-multiple-repositories.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── GitConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-2-config-server-multiple-repositories
│   │   ├── ch12-2-config-server-multiple-repositories.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── GitConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-2.iml
│   └── pom.xml
├── ch12-3
│   ├── ch12-3-config-client-db
│   │   ├── ch12-3-config-client-db.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       ├── DbConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-3-config-server-db
│   │   ├── ch12-3-config-server-db.iml
│   │   ├── pom.xml
│   │   ├── script
│   │   │   ├── ?\217\222?\205??\225??\215?.sql
│   │   │   └── ?\210\233建?\205\215置表.sql
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── DbConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-3.iml
│   └── pom.xml
├── ch12-4
│   ├── ch12-4-config-client-mongodb
│   │   ├── ch12-4-config-client-mongodb.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── boo
│   │   │       │               └── config
│   │   │       │                   └── mongodb
│   │   │       │                       ├── MongoDbConfigClientApplication.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigInfoProperties.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-4-config-server-mongodb
│   │   ├── ch12-4-config-server-mongodb.iml
│   │   ├── pom.xml
│   │   ├── script
│   │   │   └── config.json
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── boo
│   │   │       │               └── config
│   │   │       │                   └── mongodb
│   │   │       │                       └── MongoDbConfigServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-4.iml
│   └── pom.xml
├── ch12-5
│   ├── ch12-5-config-client-auto-refresh
│   │   ├── ch12-5-config-client-auto-refresh.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-5-config-client-refresh-autoconfig
│   │   ├── ch12-5-config-client-refresh-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── com
│   │   │       │       └── sc
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigClientRefreshAutoConfiguration.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-5-config-server
│   │   ├── ch12-5-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-5.iml
│   └── pom.xml
├── ch12-6
│   ├── ch12-6-config-client-fallback
│   │   ├── ch12-6-config-client-fallback.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-6-config-client-fallback-autoconfig
│   │   ├── ch12-6-config-client-fallback-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── client
│   │   │       │                       └── fallback
│   │   │       │                           ├── ConfigServerBootstrap.java
│   │   │       │                           └── FallbackableConfigServicePropertySourceLocator.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── configClient.properties
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── configClient.properties
│   ├── ch12-6-config-server
│   │   ├── ch12-6-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-6.iml
│   └── pom.xml
├── ch12-7
│   ├── ch12-7-config-client-auth-jwt
│   │   ├── ch12-7-config-client-auth-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── jwt
│   │   │       │                       ├── ClientConfigGitApplication.java
│   │   │       │                       └── controller
│   │   │       │                           └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-7-config-client-jwt
│   │   ├── ch12-7-config-client-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── jwt
│   │   │       │                       ├── config
│   │   │       │                       │   └── ConfigClientBootstrapConfiguration.java
│   │   │       │                       └── dto
│   │   │       │                           ├── LoginRequest.java
│   │   │       │                           └── Token.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-7-config-server-auth-jwt
│   │   ├── ch12-7-config-server-auth-jwt.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ConfigGitApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── SecurityConfig.java
│   │   │       │                   ├── models
│   │   │       │                   │   ├── JwtAuthenticationRequest.java
│   │   │       │                   │   ├── JwtAuthenticationResponse.java
│   │   │       │                   │   └── JwtUser.java
│   │   │       │                   ├── rest
│   │   │       │                   │   └── AuthenticationRestController.java
│   │   │       │                   └── security
│   │   │       │                       ├── JwtAuthenticationEntryPoint.java
│   │   │       │                       ├── JwtTokenUtil.java
│   │   │       │                       ├── MemberServiceImpl.java
│   │   │       │                       ├── WebAuthenticationDetailsSourceImpl.java
│   │   │       │                       └── filters
│   │   │       │                           └── JwtAuthenticationTokenFilter.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-7.iml
│   └── pom.xml
├── ch12-8
│   ├── ch12-8-config-client-high-availability
│   │   ├── ch12-8-config-client-high-availability.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-8-config-client-high-availability-autoconfig
│   │   ├── ch12-8-config-client-high-availability-autoconfig.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── configuration
│   │   │       │                       ├── ConfigSupportConfiguration.java
│   │   │       │                       └── ConfigSupportProperties.java
│   │   │       └── resources
│   │   │           └── META-INF
│   │   │               └── spring.factories
│   │   └── target
│   │       └── classes
│   │           └── META-INF
│   │               └── spring.factories
│   ├── ch12-8-config-server
│   │   ├── ch12-8-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-8.iml
│   └── pom.xml
├── ch12-9
│   ├── ch12-9-config-client
│   │   ├── ch12-9-config-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   ├── ClientConfigGitApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── ConfigClientController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch12-9-config-server-high-availability
│   │   ├── ch12-9-config-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── config
│   │   │       │                   └── ConfigGitApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-9-eureka-server
│   │   ├── ch12-9-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch12-9.iml
│   └── pom.xml
├── ch13-1
│   ├── README.md
│   ├── ch13-1-consul-config
│   │   ├── README.md
│   │   ├── ch13-1-consul-config.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── config
│   │   │       │                       └── ConsulConfigApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1-consul-consumer
│   │   ├── README.md
│   │   ├── ch13-1-consul-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       ├── ConsulConsumerApplication.java
│   │   │       │                       └── HelloService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1-consul-provider
│   │   ├── README.md
│   │   ├── ch13-1-consul-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── consul
│   │   │   │   │                   └── provider
│   │   │   │   │                       └── ConsulProviderApplication.java
│   │   │   │   └── resources
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── core
│   │   │                           └── ConcurrentMapTest.java
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch13-1.iml
│   └── pom.xml
├── ch14-1
│   ├── README.md
│   ├── ch14-1-consul-register
│   │   ├── ch14-1-consul-register.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── register
│   │   │       │                       └── ConsulRegisterApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-1.iml
│   └── pom.xml
├── ch14-2
│   ├── ch14-2-consul-consumer-discoveryclient
│   │   ├── ch14-2-consul-consumer-discoveryclient.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── discoveryclient
│   │   │       │                           └── ConsulConsumerDiscoveryclientApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-consumer-ribbon
│   │   ├── ch14-2-consul-consumer-ribbon.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── ribbon
│   │   │       │                           ├── ConsulConsumerRibbonApplication.java
│   │   │       │                           └── HelloService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-provider-tag-1
│   │   ├── ch14-2-consul-provider-tag-1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag1
│   │   │       │                           └── ConsulProviderTag1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-consul-provider-tag-2
│   │   ├── ch14-2-consul-provider-tag-2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag2
│   │   │       │                           └── ConsulProviderTag2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-2-cosul-provider-tag-1
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── consul
│   │           │                   └── provider
│   │           │                       └── tag1
│   │           │                           └── ConsulProviderTag1Application.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch14-2.iml
│   └── pom.xml
├── ch14-3
│   ├── ch14-3-consul-config-customize
│   │   ├── ch14-3-consul-config-customize.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── config
│   │   │       │                       └── customize
│   │   │       │                           └── ConsulCustomizeApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch14-3.iml
│   └── pom.xml
├── ch14-4
│   ├── ch14-4-consul-override-consumer
│   │   ├── ch14-4-consul-override-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── consumer
│   │   │       │                       └── discoveryclient
│   │   │       │                           ├── ConsulConsumerDiscoveryclientApplication.java
│   │   │       │                           └── MyConsulDiscoveryClient.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4-consul-override-provider-tag1
│   │   ├── ch14-4-consul-override-provider-tag1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag1
│   │   │       │                           └── ConsulProviderTag1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4-consul-override-provider-tag2
│   │   ├── ch14-4-consul-override-provider-tag2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider
│   │   │       │                       └── tag2
│   │   │       │                           └── ConsulProviderTag2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-4.iml
│   └── pom.xml
├── ch14-5
│   ├── ch14-5-consul-override-consumer
│   │   ├── ch14-5-consul-override-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── override
│   │   │       │                       └── consumer
│   │   │       │                           └── consulserverlist
│   │   │       │                               ├── ConsulConsumerApplication.java
│   │   │       │                               ├── Hello1Service.java
│   │   │       │                               ├── Hello2Service.java
│   │   │       │                               └── MyConsulServerList.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-override-consumer-new
│   │   ├── ch14-5-consul-override-consumer-new.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── override
│   │   │       │                       └── consumer
│   │   │       │                           ├── myconsultool
│   │   │       │                           │   ├── MyConsulRibbonClientConfiguration.java
│   │   │       │                           │   ├── MyConsulServerList.java
│   │   │       │                           │   └── MyRibbonConsulAutoConfiguration.java
│   │   │       │                           └── newconsulserverlist
│   │   │       │                               ├── Hello1Service.java
│   │   │       │                               ├── Hello2Service.java
│   │   │       │                               └── NewConsulConsumerApplication.java
│   │   │       └── resources
│   │   │           ├── META-INF
│   │   │           │   └── spring.factories
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── spring.factories
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-provider1
│   │   ├── ch14-5-consul-provider1.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider1
│   │   │       │                       └── ConsulProvider1Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5-consul-provider2
│   │   ├── ch14-5-consul-provider2.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── consul
│   │   │       │                   └── provider2
│   │   │       │                       └── ConsulProvider2Application.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch14-5.iml
│   └── pom.xml
├── ch15-1
│   ├── ch15-1-client-service
│   │   ├── ch15-1-client-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── ClientApplication.java
│   │           │               └── controller
│   │           │                   └── TestController.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1-core-service
│   │   ├── ch15-1-core-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── common
│   │           │                   ├── config
│   │           │                   │   └── CommonConfiguration.java
│   │           │                   ├── intercepter
│   │           │                   │   ├── RestTemplateUserContextInterceptor.java
│   │           │                   │   ├── UserContextHolder.java
│   │           │                   │   └── UserContextInterceptor.java
│   │           │                   ├── util
│   │           │                   │   └── UserPermissionUtil.java
│   │           │                   └── vo
│   │           │                       └── User.java
│   │           └── resources
│   │               ├── META-INF
│   │               │   └── spring.factories
│   │               └── logback.xml
│   ├── ch15-1-eureka-service
│   │   ├── ch15-1-eureka-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── EurekaServerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1-gateway
│   │   ├── ch15-1-gateway.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── gateway
│   │           │                   ├── GatewayApplication.java
│   │           │                   └── filter
│   │           │                       ├── AuthFilter.java
│   │           │                       ├── JwtUtil.java
│   │           │                       ├── PermissionException.java
│   │           │                       └── TokenController.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch15-1-provider-service
│   │   ├── ch15-1-provider-service.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── ProviderApplication.java
│   │           │               └── controller
│   │           │                   └── ProviderController.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch15-1.iml
│   └── pom.xml
├── ch16-1
│   ├── ch16-1-sleuth-consumer
│   │   ├── ch16-1-sleuth-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── consumer
│   │           │                       ├── ConsumerConfiguration.java
│   │           │                       ├── ConsumerController.java
│   │           │                       ├── HelloService.java
│   │           │                       └── SleuthConsumerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-1-sleuth-provider
│   │   ├── ch16-1-sleuth-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── provider
│   │           │                       ├── ProviderController.java
│   │           │                       └── SleuthProviderApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-1.iml
│   └── pom.xml
├── ch16-2
│   ├── ch16-2-sleuth-consumer
│   │   ├── ch16-2-sleuth-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── consumer
│   │           │                       ├── ConsumerController.java
│   │           │                       ├── HelloService.java
│   │           │                       ├── SessionFilter.java
│   │           │                       └── SleuthConsumerApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-2-sleuth-provider
│   │   ├── ch16-2-sleuth-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── sleuth
│   │           │                   └── provider
│   │           │                       ├── ProviderController.java
│   │           │                       └── SleuthProviderApplication.java
│   │           └── resources
│   │               └── bootstrap.yml
│   ├── ch16-2.iml
│   └── pom.xml
├── ch16-3
│   ├── ch16-3-eureka-server-skywalking
│   │   ├── ch16-3-eureka-skywalking.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── eureka
│   │           │                   └── EurekaServerApplication.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-script
│   │   ├── ch16-3-script.iml
│   │   ├── pom.xml
│   │   └── script
│   │       ├── drop-hbase.txt
│   │       └── init-hbase.txt
│   ├── ch16-3-service-a
│   │   ├── ch16-3-service-a.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── AServiceApplication.java
│   │           │               ├── controller
│   │           │               │   └── SkyController.java
│   │           │               └── service
│   │           │                   └── SkyFeignSerivece.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-service-b
│   │   ├── ch16-3-sevice-b.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── BServiceApplication.java
│   │           │               └── controller
│   │           │                   └── SkySecondController.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3-zuul-skywalking
│   │   ├── ch16-3-zuul-skywalking.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── zuul
│   │           │                   └── ZuulServerApplication.java
│   │           └── resources
│   │               └── application.yml
│   ├── ch16-3.iml
│   └── pom.xml
├── ch17-1
│   ├── ch17-1-1-gateway
│   │   ├── ch17-1-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-1-2-gateway
│   │   ├── ch17-1-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-1.iml
│   └── pom.xml
├── ch17-2
│   ├── ch17-2-1-gateway
│   │   ├── ch17-2-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── gateway
│   │   │   │   │               │   └── SCGatewayApplication.java
│   │   │   │   │               └── utils
│   │   │   │   │                   └── UtcTimeUtil.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SC1721GatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-2-gateway
│   │   ├── ch17-2-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── gateway
│   │   │       │               │   └── SpringCloudGatewayApplication.java
│   │   │       │               └── utils
│   │   │       │                   └── UtcTimeUtil.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SpringCloudGatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-3-gateway
│   │   ├── ch17-2-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── gateway
│   │   │   │   │               │   └── SCGatewayApplication.java
│   │   │   │   │               └── utils
│   │   │   │   │                   └── UtcTimeUtil.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── gateway
│   │       │               │   └── SCGatewayApplication.class
│   │       │               └── utils
│   │       │                   └── UtcTimeUtil.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-4-gateway
│   │   ├── ch17-2-4-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── CookieRoutePredicateFactoryTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── CookieRoutePredicateFactoryTests.class
│   ├── ch17-2-5-gateway
│   │   ├── ch17-2-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-6-gateway
│   │   ├── ch17-2-6-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── ScGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── ScGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-2-7-gateway
│   │   ├── ch17-2-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-8-gateway
│   │   ├── ch17-2-8-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-9-gateway
│   │   ├── ch17-2-7-gateway.iml
│   │   ├── ch17-2-9-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2-service
│   │   ├── ch17-2-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ServiceProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ServiceProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-2.iml
│   └── pom.xml
├── ch17-3
│   ├── ch17-3-1-gateway
│   │   ├── ch17-3-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SpringCloudGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-2-gateway
│   │   ├── ch17-3-2-gateway.iml
│   │   ├── ch17-3-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SpringCloudGatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-3-3-gateway
│   │   ├── ch17-3-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-4-gateway
│   │   ├── ch17-3-4-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-5-gateway
│   │   ├── ch17-3-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── SCGatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-6-gateway
│   │   ├── ch17-3-6-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   └── CH1736GatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── CH1736GatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-7-gateway
│   │   ├── ch17-3-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── gateway
│   │   │   │   │                   ├── CH1737GatewayApplication.java
│   │   │   │   │                   └── FallbackController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   ├── CH1737GatewayApplication.class
│   │       │                   ├── FallbackController.class
│   │       │                   └── SCGatewayApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── cn
│   │               └── springcloud
│   │                   └── book
│   │                       └── gateway
│   │                           └── ConsumerApplicationTests.class
│   ├── ch17-3-service
│   │   ├── ch17-3-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ServiceProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ServiceProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch17-3.iml
│   └── pom.xml
├── ch18-1
│   ├── ch18-1-consumer
│   │   ├── ch18-1-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── HelloConsumerApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── HelloController.java
│   │   │       │               └── feign
│   │   │       │                   └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloConsumerApplication.class
│   │       │               ├── controller
│   │       │               │   └── HelloController.class
│   │       │               └── feign
│   │       │                   └── HelloFeignService.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-eureka
│   │   ├── ch18-1-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-gateway
│   │   ├── ch18-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── GatewayServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── GatewayServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1-provider
│   │   ├── ch18-1-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── HelloProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-1.iml
│   └── pom.xml
├── ch18-2
│   ├── ch18-2-gateway
│   │   ├── ch18-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── GatewayServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   ├── AuthSignatureFilter.java
│   │   │       │                   └── CustomGatewayFilter.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── GatewayServerApplication.class
│   │       │               └── filter
│   │       │                   ├── AuthSignatureFilter.class
│   │       │                   └── CustomGatewayFilter.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-2-provider
│   │   ├── ch18-2-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── HelloProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── HelloProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-2.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch18-3
│   ├── ch18-3-gateway
│   │   ├── ch18-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   └── GatewayApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   └── GatewayApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-3-provider
│   │   ├── ch18-3-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── service
│   │   │       │                   ├── ServiceApplication.java
│   │   │       │                   └── ServiceController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── service
│   │       │                   ├── ServiceApplication.class
│   │       │                   └── ServiceController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-3.iml
│   └── pom.xml
├── ch18-4
│   ├── ch18-4-eureka
│   │   ├── ch18-4-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-4-gateway-https
│   │   ├── ch18-4-gateway-https.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   ├── GatewayApplication.java
│   │   │       │                   └── filter
│   │   │       │                       ├── HttpSchemeFilter.java
│   │   │       │                       └── HttpsToHttpFilter.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── selfsigned.jks
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── gateway
│   │       │   │               ├── GatewayApplication.class
│   │       │   │               └── filter
│   │       │   │                   ├── HttpSchemeFilter.class
│   │       │   │                   └── HttpsToHttpFilter.class
│   │       │   └── selfsigned.jks
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4-service-a
│   │   ├── ch18-4-service-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4-service-b
│   │   ├── ch18-4-service-b.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── eureka
│   │       │                   ├── ProviderApplication.class
│   │       │                   └── controller
│   │       │                       └── TestController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-4.iml
│   ├── pom.xml
│   └── reademe.md
├── ch18-5
│   ├── ch18-5-eureka
│   │   ├── ch18-5-eureka.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── EurekaServerApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-5-gateway
│   │   ├── ch18-5-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── GatewayApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── GatewaySwaggerProvider.java
│   │   │       │               ├── filter
│   │   │       │               │   └── GwSwaggerHeaderFilter.java
│   │   │       │               └── handler
│   │   │       │                   └── SwaggerHandler.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── GatewayApplication.class
│   │       │               ├── config
│   │       │               │   └── SwaggerProvider.class
│   │       │               ├── filter
│   │       │               │   └── SwaggerHeaderFilter.class
│   │       │               └── handler
│   │       │                   └── SwaggerHandler.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-5-service
│   │   ├── ch18-5-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ServiceProviderApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── SwaggerConfig.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── ServiceProviderApplication.class
│   │       │               ├── config
│   │       │               │   └── SwaggerConfig.class
│   │       │               └── controller
│   │       │                   └── TestController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch18-5.iml
│   └── pom.xml
├── ch18-6
│   ├── ch18-6-1-gateway
│   │   ├── ch18-6-1-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── filter
│   │   │   │   │                   └── GatewayRateLimitFilterByIp.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-2-gateway
│   │   ├── ch18-6-2-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── RemoteAddrKeyResolver.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           ├── GatewayApplication.class
│   │       │   │           ├── RemoteAddrKeyResolver.class
│   │       │   │           └── filter
│   │       │   │               ├── RateLimitByCpuGatewayFilter.class
│   │       │   │               └── RateLimitByIpGatewayFilter.class
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-3-gateway
│   │   ├── ch18-6-3-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── GatewayApplication.java
│   │   │   │   │               └── filter
│   │   │   │   │                   └── GatewayRateLimitFilterByCpu.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           ├── GatewayApplication.class
│   │       │   │           └── filter
│   │       │   │               ├── GatewayRateLimitFilterByCpu.class
│   │       │   │               ├── RateLimitByCpuGatewayFilter.class
│   │       │   │               └── RateLimitByIpGatewayFilter.class
│   │       │   └── com
│   │       │       └── windmt
│   │       │           ├── FallbackController.class
│   │       │           ├── GatewayApplication.class
│   │       │           └── filter
│   │       │               ├── ElapsedFilter.class
│   │       │               ├── RateLimitByCpuGatewayFilter.class
│   │       │               ├── RateLimitByIpGatewayFilter$RateLimitByIpGatewayFilterBuilder.class
│   │       │               ├── RateLimitByIpGatewayFilter.class
│   │       │               ├── TokenFilter.class
│   │       │               ├── factory
│   │       │               │   ├── ElapsedGatewayFilterFactory$Config.class
│   │       │               │   └── ElapsedGatewayFilterFactory.class
│   │       │               └── ratelimit
│   │       │                   └── RemoteAddrKeyResolver.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       └── test-classes
│   │           └── com
│   │               └── windmt
│   │                   └── GatewayApplicationTests.class
│   ├── ch18-6-provider
│   │   ├── ch18-6-provider.iml
│   │   ├── pom.xml
│   │   ├── producer.iml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── ProviderApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── HelloController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               ├── ProviderApplication.class
│   │       │               └── controller
│   │       │                   └── HelloController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       ├── generated-test-sources
│   │       │   └── test-annotations
│   │       └── test-classes
│   ├── ch18-6.iml
│   └── pom.xml
├── ch18-7
│   ├── ch18-7-gateway
│   │   ├── ch18-7-gateway.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── gateway
│   │   │       │                   ├── GatewayApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── RouteController.java
│   │   │       │                   ├── model
│   │   │       │                   │   ├── GatewayFilterDefinition.java
│   │   │       │                   │   ├── GatewayPredicateDefinition.java
│   │   │       │                   │   └── GatewayRouteDefinition.java
│   │   │       │                   ├── repository
│   │   │       │                   │   └── UnifiedRouteRepositoryImpl.java
│   │   │       │                   └── route
│   │   │       │                       └── DynamicRouteServiceImpl.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── gateway
│   │       │                   ├── GatewayApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── RouteController.class
│   │       │                   ├── model
│   │       │                   │   ├── GatewayFilterDefinition.class
│   │       │                   │   ├── GatewayPredicateDefinition.class
│   │       │                   │   └── GatewayRouteDefinition.class
│   │       │                   ├── repository
│   │       │                   │   └── DbRouteDefinitionRepository.class
│   │       │                   └── route
│   │       │                       └── DynamicRouteServiceImpl.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch18-7.iml
│   ├── pom.xml
│   └── readme.md
├── ch19-1
│   ├── ch19-1.iml
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── cn
│   │   │   │       └── springcloud
│   │   │   │           ├── ChapterGrpcApplication.java
│   │   │   │           └── PersonUseCase.java
│   │   │   ├── proto
│   │   │   │   └── person.proto
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── cn
│   │               └── springcloud
│   │                   └── ChapterGrpcApplicationTests.java
│   └── target
│       ├── classes
│       │   └── cn
│       │       └── springcloud
│       │           ├── ChapterGrpcApplication.class
│       │           ├── PersonUseCase.class
│       │           └── proto
│       │               ├── PersonModel$1.class
│       │               ├── PersonModel$Person$1.class
│       │               ├── PersonModel$Person$Builder.class
│       │               ├── PersonModel$Person.class
│       │               ├── PersonModel$PersonOrBuilder.class
│       │               └── PersonModel.class
│       ├── generated-sources
│       │   ├── annotations
│       │   └── protobuf
│       │       └── java
│       │           └── cn
│       │               └── springcloud
│       │                   └── proto
│       │                       └── PersonModel.java
│       ├── generated-test-sources
│       │   └── test-annotations
│       ├── protoc-dependencies
│       │   └── 7fccca4fa45ec798ad2d10dc18b97d22
│       │       └── google
│       │           └── protobuf
│       │               ├── any.proto
│       │               ├── api.proto
│       │               ├── compiler
│       │               │   └── plugin.proto
│       │               ├── descriptor.proto
│       │               ├── duration.proto
│       │               ├── empty.proto
│       │               ├── field_mask.proto
│       │               ├── source_context.proto
│       │               ├── struct.proto
│       │               ├── timestamp.proto
│       │               ├── type.proto
│       │               └── wrappers.proto
│       ├── protoc-plugins
│       │   └── protoc-3.5.1-osx-x86_64.exe
│       └── test-classes
│           └── cn
│               └── springcloud
│                   └── ChapterGrpcApplicationTests.class
├── ch19-2
│   ├── ch19-2.iml
│   ├── grpc-lib-1
│   │   ├── grpc-lib-1.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── proto
│   │   │       │   └── HiService.proto
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   ├── HiService.proto
│   │       │   ├── application.properties
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpc
│   │       │               ├── HelloRequest$1.class
│   │       │               ├── HelloRequest$Builder.class
│   │       │               ├── HelloRequest$TagsDefaultEntryHolder.class
│   │       │               ├── HelloRequest.class
│   │       │               ├── HelloRequestOrBuilder.class
│   │       │               ├── HelloResponse$1.class
│   │       │               ├── HelloResponse$Builder.class
│   │       │               ├── HelloResponse.class
│   │       │               ├── HelloResponseOrBuilder.class
│   │       │               ├── HelloServiceGrpc$1.class
│   │       │               ├── HelloServiceGrpc$HelloServiceBaseDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceBlockingStub.class
│   │       │               ├── HelloServiceGrpc$HelloServiceFileDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceFutureStub.class
│   │       │               ├── HelloServiceGrpc$HelloServiceImplBase.class
│   │       │               ├── HelloServiceGrpc$HelloServiceMethodDescriptorSupplier.class
│   │       │               ├── HelloServiceGrpc$HelloServiceStub.class
│   │       │               ├── HelloServiceGrpc$MethodHandlers.class
│   │       │               ├── HelloServiceGrpc.class
│   │       │               ├── HiService$1.class
│   │       │               └── HiService.class
│   │       ├── generated-sources
│   │       │   ├── annotations
│   │       │   └── protobuf
│   │       │       ├── grpc-java
│   │       │       │   └── cn
│   │       │       │       └── springcloud
│   │       │       │           └── grpc
│   │       │       │               └── HelloServiceGrpc.java
│   │       │       └── java
│   │       │           └── cn
│   │       │               └── springcloud
│   │       │                   └── grpc
│   │       │                       ├── HelloRequest.java
│   │       │                       ├── HelloRequestOrBuilder.java
│   │       │                       ├── HelloResponse.java
│   │       │                       ├── HelloResponseOrBuilder.java
│   │       │                       └── HiService.java
│   │       ├── grpc-lib-1-0.0.1-SNAPSHOT.jar
│   │       ├── maven-archiver
│   │       │   └── pom.properties
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       ├── protoc-dependencies
│   │       │   └── 7fccca4fa45ec798ad2d10dc18b97d22
│   │       │       └── google
│   │       │           └── protobuf
│   │       │               ├── any.proto
│   │       │               ├── api.proto
│   │       │               ├── compiler
│   │       │               │   └── plugin.proto
│   │       │               ├── descriptor.proto
│   │       │               ├── duration.proto
│   │       │               ├── empty.proto
│   │       │               ├── field_mask.proto
│   │       │               ├── source_context.proto
│   │       │               ├── struct.proto
│   │       │               ├── timestamp.proto
│   │       │               ├── type.proto
│   │       │               └── wrappers.proto
│   │       └── protoc-plugins
│   │           ├── protoc-3.5.1-osx-x86_64.exe
│   │           └── protoc-gen-grpc-java-1.11.0-osx-x86_64.exe
│   ├── grpc-simple-client
│   │   ├── grpc-simple-client.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── grpcsimpleclient
│   │   │       │               └── MyGrpcClient.java
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpcsimpleclient
│   │       │               └── MyGrpcClient.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── grpc-simple-server
│   │   ├── grpc-simple-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── grpcsimpleserver
│   │   │       │               ├── MyGrpcServer.java
│   │   │       │               └── servcie
│   │   │       │                   └── HelloService.java
│   │   │       └── resources
│   │   │           └── application.properties
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── grpcsimpleserver
│   │       │               ├── MyGrpcServer.class
│   │       │               └── servcie
│   │       │                   └── HelloService.class
│   │       └── generated-sources
│   │           └── annotations
│   └── pom.xml
├── ch2-1
│   ├── ch2-1-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch21EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-demo.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch21EurekaClientApplicationTests.java
│   ├── ch2-1-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch21EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-standalone.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch21EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch2-2
│   ├── ch2-2-eureka-client
│   │   ├── ch2-2-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-demo.yml
│   │           └── application.yml
│   ├── ch2-2-eureka-server
│   │   ├── ch2-2-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-standalone.yml
│   │           └── application.yml
│   └── ch2-2.iml
├── ch20
│   ├── ch20.iml
│   ├── cloud-eureka-server
│   │   ├── cloud-eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudeurekaserver
│   │   │       │               └── CloudEurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudeurekaserver
│   │       │               └── CloudEurekaServerApplication.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── cloud-grpc-client
│   │   ├── cloud-grpc-client.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudgrpcclient
│   │   │       │               ├── CloudGrpcClientApplication.java
│   │   │       │               ├── GlobalClientInterceptorConfiguration.java
│   │   │       │               ├── GrpcClientController.java
│   │   │       │               ├── GrpcClientService.java
│   │   │       │               └── LogGrpcInterceptor.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudgrpcclient
│   │       │               ├── CloudGrpcClientApplication.class
│   │       │               ├── GlobalClientInterceptorConfiguration$1.class
│   │       │               ├── GlobalClientInterceptorConfiguration.class
│   │       │               ├── GrpcClientController.class
│   │       │               ├── GrpcClientService.class
│   │       │               └── LogGrpcInterceptor.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── cloud-grpc-server
│   │   ├── cloud-grpc-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── cloudgrpcserver
│   │   │       │               ├── CloudGrpcServerApplication.java
│   │   │       │               ├── GlobalInterceptorConfiguration.java
│   │   │       │               ├── GrpcServerService.java
│   │   │       │               └── LogGrpcInterceptor.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── cloudgrpcserver
│   │       │               ├── CloudGrpcServerApplication.class
│   │       │               ├── GlobalInterceptorConfiguration$1.class
│   │       │               ├── GlobalInterceptorConfiguration.class
│   │       │               ├── GrpcServerService.class
│   │       │               └── LogGrpcInterceptor.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── grpc-lib
│   │   ├── grpc-lib.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── proto
│   │   │           └── helloworld.proto
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── grpc
│   │       │   │           └── lib
│   │       │   │               ├── HelloReply$1.class
│   │       │   │               ├── HelloReply$Builder.class
│   │       │   │               ├── HelloReply.class
│   │       │   │               ├── HelloReplyOrBuilder.class
│   │       │   │               ├── HelloRequest$1.class
│   │       │   │               ├── HelloRequest$Builder.class
│   │       │   │               ├── HelloRequest.class
│   │       │   │               ├── HelloRequestOrBuilder.class
│   │       │   │               ├── HelloWorldProto$1.class
│   │       │   │               ├── HelloWorldProto.class
│   │       │   │               ├── SimpleGrpc$1.class
│   │       │   │               ├── SimpleGrpc$MethodHandlers.class
│   │       │   │               ├── SimpleGrpc$SimpleBlockingStub.class
│   │       │   │               ├── SimpleGrpc$SimpleDescriptorSupplier.class
│   │       │   │               ├── SimpleGrpc$SimpleFutureStub.class
│   │       │   │               ├── SimpleGrpc$SimpleImplBase.class
│   │       │   │               ├── SimpleGrpc$SimpleStub.class
│   │       │   │               └── SimpleGrpc.class
│   │       │   └── helloworld.proto
│   │       ├── generated-sources
│   │       │   ├── annotations
│   │       │   └── protobuf
│   │       │       ├── grpc-java
│   │       │       │   └── cn
│   │       │       │       └── springcloud
│   │       │       │           └── grpc
│   │       │       │               └── lib
│   │       │       │                   └── SimpleGrpc.java
│   │       │       └── java
│   │       │           └── cn
│   │       │               └── springcloud
│   │       │                   └── grpc
│   │       │                       └── lib
│   │       │                           ├── HelloReply.java
│   │       │                           ├── HelloReplyOrBuilder.java
│   │       │                           ├── HelloRequest.java
│   │       │                           ├── HelloRequestOrBuilder.java
│   │       │                           └── HelloWorldProto.java
│   │       ├── grpc-lib-0.0.1-SNAPSHOT.jar
│   │       ├── maven-archiver
│   │       │   └── pom.properties
│   │       ├── maven-status
│   │       │   └── maven-compiler-plugin
│   │       │       └── compile
│   │       │           └── default-compile
│   │       │               ├── createdFiles.lst
│   │       │               └── inputFiles.lst
│   │       ├── protoc-dependencies
│   │       │   └── 290dcf8941ab2ac716c165e32e5347f0
│   │       │       └── google
│   │       │           └── protobuf
│   │       │               ├── any.proto
│   │       │               ├── api.proto
│   │       │               ├── compiler
│   │       │               │   └── plugin.proto
│   │       │               ├── descriptor.proto
│   │       │               ├── duration.proto
│   │       │               ├── empty.proto
│   │       │               ├── field_mask.proto
│   │       │               ├── source_context.proto
│   │       │               ├── struct.proto
│   │       │               ├── timestamp.proto
│   │       │               ├── type.proto
│   │       │               └── wrappers.proto
│   │       └── protoc-plugins
│   │           ├── protoc-3.3.0-osx-x86_64.exe
│   │           └── protoc-gen-grpc-java-1.6.1-osx-x86_64.exe
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch21-1
│   ├── ch21-1-discovery-console
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── ConsoleApplication.java
│   │           └── resources
│   │               └── application.properties
│   ├── ch21-1-eureka-server
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── EurekaServerApplication.java
│   │           └── resources
│   │               ├── application.properties
│   │               └── logback.xml
│   ├── ch21-1-original-service
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DiscoveryApplicationA1.java
│   │           │               ├── DiscoveryApplicationA2.java
│   │           │               ├── DiscoveryApplicationB1.java
│   │           │               ├── DiscoveryApplicationB2.java
│   │           │               ├── DiscoveryApplicationC1.java
│   │           │               ├── DiscoveryApplicationC2.java
│   │           │               ├── DiscoveryApplicationC3.java
│   │           │               ├── extension
│   │           │               │   ├── MyDiscoveryEnabledAdapter.java
│   │           │               │   ├── MyDiscoveryListener.java
│   │           │               │   ├── MyLoadBalanceListener.java
│   │           │               │   ├── MyRegisterListener.java
│   │           │               │   └── MySubscriber.java
│   │           │               └── feign
│   │           │                   ├── AFeign.java
│   │           │                   ├── AFeignImpl.java
│   │           │                   ├── AbstractFeignImpl.java
│   │           │                   ├── BFeign.java
│   │           │                   ├── BFeignImpl.java
│   │           │                   ├── CFeign.java
│   │           │                   ├── CFeignImpl.java
│   │           │                   └── FeignConfiguration.java
│   │           └── resources
│   │               ├── application-a1.properties
│   │               ├── application-a2.properties
│   │               ├── application-b1.properties
│   │               ├── application-b2.properties
│   │               ├── application-c1.properties
│   │               ├── application-c2.properties
│   │               ├── application-c3.properties
│   │               ├── bootstrap.properties
│   │               ├── logback.xml
│   │               ├── rule.json
│   │               └── rule.xml
│   ├── ch21-1-zuul-server
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DiscoveryApplicationZuul.java
│   │           │               └── extension
│   │           │                   └── MyDiscoveryEnabledAdapter.java
│   │           └── resources
│   │               ├── application-zuul.properties
│   │               ├── bootstrap.properties
│   │               ├── logback.xml
│   │               ├── rule.json
│   │               └── rule.xml
│   └── pom.xml
├── ch21-3
│   ├── ch21-3-discovery-console
│   │   └── ch21-3-discovery-console.iml
│   ├── ch21-3-eureka-server
│   │   └── ch21-3-eureka-server.iml
│   ├── ch21-3-original-service
│   │   └── ch21-3-original-service.iml
│   ├── ch21-3-zuul-server
│   │   └── ch21-3-zuul-server.iml
│   └── ch21-3.iml
├── ch22-1
│   ├── ch22-1-2-dockerfile
│   │   ├── alpine-glibc
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java10
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java11
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   ├── java8
│   │   │   ├── Dockerfile
│   │   │   └── README.MD
│   │   └── java9
│   │       ├── Dockerfile
│   │       └── README.MD
│   ├── ch22-1-3-jdk8-docker
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-1-3-jdk8-docker.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2213Jdk8DockerApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.properties
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2213Jdk8DockerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.properties
│   ├── ch22-1-4-jdk10-docker
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-1-4-jdk10-docker.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── Ch2214Jdk10DockerApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── ArgsController.java
│   │   │   │   └── resources
│   │   │   │       └── application.properties
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2214Jdk10DockerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.properties
│   ├── ch22-1.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-2
│   ├── ch22-2-1-config-server
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-1-config-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2221ConfigServerApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       └── db
│   │   │   │           ├── data.sql
│   │   │   │           └── schema.sql
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2221ConfigServerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── db
│   │               ├── data.sql
│   │               └── schema.sql
│   ├── ch22-2-2-eureka-server
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-2-eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2222EurekaServerApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.yml
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2222EurekaServerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch22-2-3-gateway
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-3-gateway.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2223GatewayApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2223GatewayApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-4-turbine
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-4-turbine.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2223TurbineApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2223TurbineApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-5-spring-admin
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-5-spring-admin.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2225SpringAdminApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2225SpringAdminApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2-6-biz-service
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-2-6-biz-service.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2226BizServiceApplication.java
│   │   │   │   └── resources
│   │   │   │       ├── application.properties
│   │   │   │       └── bootstrap.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2226BizServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           └── bootstrap.yml
│   ├── ch22-2.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-3
│   ├── ch22-3-1
│   │   ├── k8s
│   │   │   ├── biz-service-rc.yml
│   │   │   ├── config-server-rc.yml
│   │   │   ├── config-server-svc.yml
│   │   │   ├── eureka-server-1-rc.yml
│   │   │   ├── eureka-server-1-svc.yml
│   │   │   ├── eureka-server-2-rc.yml
│   │   │   ├── eureka-server-2-svc.yml
│   │   │   ├── gateway-rc.yml
│   │   │   ├── gateway-svc.yml
│   │   │   ├── spring-admin-rc.yml
│   │   │   ├── spring-admin-svc.yml
│   │   │   ├── turbine-rc.yml
│   │   │   └── turbine-svc.yml
│   │   └── minikube
│   │       └── README.MD
│   ├── ch22-3-2-example-service
│   │   ├── Dockerfile
│   │   ├── README.MD
│   │   ├── ch22-3-2-example-service.iml
│   │   ├── example-service-dm.yml
│   │   ├── example-service-hpa.yml
│   │   ├── example-service-rc.yml
│   │   ├── example-service-svc.yml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── Ch2232ExampleServiceApplication.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2232ExampleServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch22-3-3-example-service
│   │   ├── Dockerfile
│   │   ├── ch22-3-3-example-service.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               ├── Ch2233ExampleServiceApplication.java
│   │   │   │   │               └── controller
│   │   │   │   │                   └── VersionController.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── Ch2233ExampleServiceApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch22-3.iml
│   ├── metrics-server-0.2.1
│   │   ├── README.MD
│   │   ├── auth-delegator.yaml
│   │   ├── auth-reader.yaml
│   │   ├── metrics-apiservice.yaml
│   │   ├── metrics-server-deployment.yaml
│   │   ├── metrics-server-service.yaml
│   │   └── resource-reader.yaml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-1
│   ├── ch23-1.iml
│   ├── demo-consumer
│   │   ├── demo-consumer.iml
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   └── java
│   │       │       └── cn
│   │       │           └── springcloud
│   │       │               └── book
│   │       │                   └── ConsumerMain.java
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── AppTest.java
│   ├── demo-provider
│   │   ├── demo-provider.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── service
│   │                               ├── HelloServiceImpl.java
│   │                               └── ProviderMain.java
│   ├── dubbo-provider-api
│   │   ├── dubbo-provider-api.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── HelloService.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-2
│   ├── ch23-2.iml
│   ├── demo-dubbo-consumer
│   │   ├── demo-dubbo-consumer.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── DemoDubboConsumerApplication.java
│   │       │   │               └── service
│   │       │   │                   └── DemoConsumer.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── DemoDubboConsumerApplicationTests.java
│   ├── demo-dubbo-provider
│   │   ├── demo-dubbo-provider.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── DemoDubboProviderApplication.java
│   │           │               └── service
│   │           │                   └── HelloServiceImpl.java
│   │           └── resources
│   │               └── application.yml
│   ├── demo-dubbo-provider-api
│   │   ├── demo-dubbo-provider-api.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── service
│   │                               └── HelloService.java
│   ├── eureka-server
│   │   ├── eureka-server.iml
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── EurekaServerApplication.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch24
│   ├── ch24-jta-atomikos
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch24JtaAtomikosApplication.java
│   │       │   │               ├── config
│   │       │   │               │   ├── AtomikosJtaPlatform.java
│   │       │   │               │   ├── LogDatasourceConfig.java
│   │       │   │               │   └── OrderDatasourceConfig.java
│   │       │   │               ├── dao
│   │       │   │               │   ├── log
│   │       │   │               │   │   └── EventLogDao.java
│   │       │   │               │   └── order
│   │       │   │               │       └── UserOrderDao.java
│   │       │   │               ├── domain
│   │       │   │               │   ├── log
│   │       │   │               │   │   └── EventLog.java
│   │       │   │               │   └── order
│   │       │   │               │       └── UserOrder.java
│   │       │   │               └── service
│   │       │   │                   └── OrderService.java
│   │       │   └── resources
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch24JtaAtomikosApplicationTests.java
│   ├── ch24-saga-servicecomb
│   │   ├── alpha-server
│   │   │   ├── README.MD
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   ├── schema-postgresql.sql
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               └── SagaAlphaServerApplication.java
│   │   │       │   └── resources
│   │   │       │       ├── application.yml
│   │   │       │       └── db
│   │   │       │           ├── data.sql
│   │   │       │           └── schema.sql
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── SagaAlphaServerApplicationTests.java
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── omega-inventory-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OmegaInventoryServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── InventoryController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── InventoryDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   └── Inventory.java
│   │   │       │   │               ├── dto
│   │   │       │   │               │   └── OrderRequest.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── InventoryService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OmegaInventoryServiceApplicationTests.java
│   │   ├── omega-order-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OmegaOrderServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── OrderController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── OrderDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   ├── OrderState.java
│   │   │       │   │               │   └── UserOrder.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── OrderService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OmegaOrderServiceApplicationTests.java
│   │   ├── pom.xml
│   │   └── saga-servicecomb-example
│   │       ├── mvnw
│   │       ├── mvnw.cmd
│   │       ├── pom.xml
│   │       └── src
│   │           ├── main
│   │           │   ├── java
│   │           │   │   └── cn
│   │           │   │       └── springcloud
│   │           │   │           └── book
│   │           │   │               ├── SagaServicecombExampleApplication.java
│   │           │   │               ├── config
│   │           │   │               │   └── RestConfig.java
│   │           │   │               ├── controller
│   │           │   │               │   └── SagaOrderController.java
│   │           │   │               └── dto
│   │           │   │                   └── OrderRequest.java
│   │           │   └── resources
│   │           │       └── application.yml
│   │           └── test
│   │               └── java
│   │                   └── cn
│   │                       └── springcloud
│   │                           └── book
│   │                               └── SagaServicecombExampleApplicationTests.java
│   ├── ch24-tcc-rest
│   │   ├── inventory-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── InventoryServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── InventoryController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   ├── FrozeRequestDao.java
│   │   │       │   │               │   └── InventoryDao.java
│   │   │       │   │               ├── domain
│   │   │       │   │               │   ├── FrozeRequest.java
│   │   │       │   │               │   └── Inventory.java
│   │   │       │   │               └── service
│   │   │       │   │                   └── FrozeService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── InventoryServiceApplicationTests.java
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── order-service
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── OrderServiceApplication.java
│   │   │       │   │               ├── controller
│   │   │       │   │               │   └── OrderController.java
│   │   │       │   │               ├── dao
│   │   │       │   │               │   └── OrderDao.java
│   │   │       │   │               └── domain
│   │   │       │   │                   ├── OrderState.java
│   │   │       │   │                   └── UserOrder.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── OrderServiceApplicationTests.java
│   │   ├── pom.xml
│   │   ├── tcc-coordinator-atomikos
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── TccCoordinatorAtomikosApplication.java
│   │   │       │   │               ├── config
│   │   │       │   │               │   └── AtomikosTccConfig.java
│   │   │       │   │               └── controller
│   │   │       │   │                   └── TccCoordinatorController.java
│   │   │       │   └── resources
│   │   │       │       ├── application.yml
│   │   │       │       └── logback.xml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── TccCoordinatorAtomikosApplicationTests.java
│   │   ├── tcc-coordinator-example
│   │   │   ├── mvnw
│   │   │   ├── mvnw.cmd
│   │   │   ├── pom.xml
│   │   │   └── src
│   │   │       ├── main
│   │   │       │   ├── java
│   │   │       │   │   └── cn
│   │   │       │   │       └── springcloud
│   │   │       │   │           └── book
│   │   │       │   │               ├── TccCoordinatorExampleApplication.java
│   │   │       │   │               ├── config
│   │   │       │   │               │   └── RestConfig.java
│   │   │       │   │               ├── dto
│   │   │       │   │               │   ├── FrozeRequest.java
│   │   │       │   │               │   └── OrderRequest.java
│   │   │       │   │               └── service
│   │   │       │   │                   ├── TccCoordinatorClient.java
│   │   │       │   │                   └── TccOrderService.java
│   │   │       │   └── resources
│   │   │       │       └── application.yml
│   │   │       └── test
│   │   │           └── java
│   │   │               └── cn
│   │   │                   └── springcloud
│   │   │                       └── book
│   │   │                           └── TccCoordinatorExampleApplicationTests.java
│   │   └── tcc-rest-participant-api
│   │       ├── pom.xml
│   │       └── src
│   │           ├── main
│   │           │   └── java
│   │           │       └── cn
│   │           │           └── springcloud
│   │           │               └── book
│   │           │                   └── controller
│   │           │                       └── TccParticipantController.java
│   │           └── test
│   │               └── java
│   │                   └── cn
│   │                       └── springcloud
│   │                           └── book
│   │                               └── AppTest.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch24-3
│   ├── ch24-3-1-jta-atomikos
│   │   └── ch24-3-1-jta-atomikos.iml
│   ├── ch24-3-2-tcc-rest
│   │   ├── ch24-3-2-tcc-rest.iml
│   │   ├── inventory-service
│   │   │   └── inventory-service.iml
│   │   ├── order-service
│   │   │   └── order-service.iml
│   │   ├── tcc-coordinator-atomikos
│   │   │   └── tcc-coordinator-atomikos.iml
│   │   ├── tcc-coordinator-example
│   │   │   └── tcc-coordinator-example.iml
│   │   └── tcc-rest-participant-api
│   │       └── tcc-rest-participant-api.iml
│   └── ch24-3.iml
├── ch25
│   ├── LICENSE
│   ├── README.md
│   ├── ch25.iml
│   ├── crm-sales-app
│   │   ├── crm-sales-app.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   └── java
│   │   │   │       └── cn
│   │   │   │           └── springcloud
│   │   │   │               └── book
│   │   │   │                   └── crm
│   │   │   │                       └── sales
│   │   │   │                           ├── assembler
│   │   │   │                           │   └── CustomerAssembler.java
│   │   │   │                           ├── command
│   │   │   │                           │   ├── CustomerAddCmdExe.java
│   │   │   │                           │   ├── CustomerCheckConflictCmdExe.java
│   │   │   │                           │   ├── extension
│   │   │   │                           │   │   ├── CustomerSearchConditionCGSExt.java
│   │   │   │                           │   │   ├── CustomerSearchConditionExt.java
│   │   │   │                           │   │   └── CustomerSearchConditionTPExt.java
│   │   │   │                           │   ├── extensionpoint
│   │   │   │                           │   │   └── CustomerCheckConflictSearchConditionExtPt.java
│   │   │   │                           │   └── query
│   │   │   │                           │       └── CustomerFindByCriteriaQueryExe.java
│   │   │   │                           ├── event
│   │   │   │                           │   └── handler
│   │   │   │                           │       └── CustomerChangeEventHandler.java
│   │   │   │                           ├── interceptor
│   │   │   │                           │   ├── HaloContextPostInterceptor.java
│   │   │   │                           │   ├── HaloContextPreInterceptor.java
│   │   │   │                           │   ├── LoggerPostInterceptor.java
│   │   │   │                           │   ├── LoggerPreInterceptor.java
│   │   │   │                           │   └── ValidationInterceptor.java
│   │   │   │                           ├── service
│   │   │   │                           │   └── CustomerServiceImpl.java
│   │   │   │                           └── validator
│   │   │   │                               ├── CustomerAddValidator.java
│   │   │   │                               ├── extension
│   │   │   │                               │   ├── CustomerAddCGSValidator.java
│   │   │   │                               │   └── CustomerAddDDValidator.java
│   │   │   │                               └── extensionpoint
│   │   │   │                                   └── CustomerAddValidatorExtPt.java
│   │   │   └── test
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── assembler
│   │       │                       │   └── CustomerAssembler.class
│   │       │                       ├── command
│   │       │                       │   ├── CustomerAddCmdExe.class
│   │       │                       │   ├── CustomerCheckConflictCmdExe.class
│   │       │                       │   ├── extension
│   │       │                       │   │   ├── CustomerSearchConditionCGSExt.class
│   │       │                       │   │   ├── CustomerSearchConditionExt.class
│   │       │                       │   │   └── CustomerSearchConditionTPExt.class
│   │       │                       │   ├── extensionpoint
│   │       │                       │   │   └── CustomerCheckConflictSearchConditionExtPt.class
│   │       │                       │   └── query
│   │       │                       │       └── CustomerFindByCriteriaQueryExe.class
│   │       │                       ├── event
│   │       │                       │   └── handler
│   │       │                       │       └── CustomerChangeEventHandler.class
│   │       │                       ├── interceptor
│   │       │                       │   ├── HaloContextPostInterceptor.class
│   │       │                       │   ├── HaloContextPreInterceptor.class
│   │       │                       │   ├── LoggerPostInterceptor.class
│   │       │                       │   ├── LoggerPreInterceptor.class
│   │       │                       │   └── ValidationInterceptor.class
│   │       │                       ├── service
│   │       │                       │   └── CustomerServiceImpl.class
│   │       │                       └── validator
│   │       │                           ├── CustomerAddValidator.class
│   │       │                           ├── extension
│   │       │                           │   ├── CustomerAddCGSValidator.class
│   │       │                           │   └── CustomerAddDDValidator.class
│   │       │                           └── extensionpoint
│   │       │                               └── CustomerAddValidatorExtPt.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-client
│   │   ├── crm-sales-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       └── crm
│   │   │                           └── sales
│   │   │                               ├── api
│   │   │                               │   └── CustomerServiceI.java
│   │   │                               └── dto
│   │   │                                   ├── CustomerAddCmd.java
│   │   │                                   ├── CustomerCheckConflictCmd.java
│   │   │                                   ├── CustomerFindByCriteriaQry.java
│   │   │                                   ├── CustomerFindByNameQry.java
│   │   │                                   ├── CustomerUpdateCmd.java
│   │   │                                   └── clientobject
│   │   │                                       ├── CustomerCO.java
│   │   │                                       ├── CustomerType.java
│   │   │                                       ├── LeadCO.java
│   │   │                                       ├── OppertunityCO.java
│   │   │                                       └── QueryCriteria.java
│   │   └── target
│   │       ├── classes
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── api
│   │       │                       │   └── CustomerServiceI.class
│   │       │                       └── dto
│   │       │                           ├── CustomerAddCmd.class
│   │       │                           ├── CustomerCheckConflictCmd.class
│   │       │                           ├── CustomerFindByCriteriaQry.class
│   │       │                           ├── CustomerFindByNameQry.class
│   │       │                           ├── CustomerUpdateCmd.class
│   │       │                           └── clientobject
│   │       │                               ├── CustomerCO.class
│   │       │                               ├── CustomerType.class
│   │       │                               ├── LeadCO.class
│   │       │                               ├── OppertunityCO.class
│   │       │                               └── QueryCriteria.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-consumer
│   │   ├── crm-sales-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       ├── ConsumerApplication.java
│   │   │       │                       └── CustomerController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       ├── ConsumerApplication.class
│   │       │                       └── CustomerController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-domain
│   │   ├── crm-sales-domain.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       └── domain
│   │   │       │                           └── customer
│   │   │       │                               ├── convertor
│   │   │       │                               │   ├── CustomerConvertor.java
│   │   │       │                               │   ├── extension
│   │   │       │                               │   │   ├── CustomerCGSConvertorExt.java
│   │   │       │                               │   │   └── CustomerDDConvertorExt.java
│   │   │       │                               │   └── extensionpoint
│   │   │       │                               │       └── CustomerConvertorExtPt.java
│   │   │       │                               ├── entity
│   │   │       │                               │   ├── ContactE.java
│   │   │       │                               │   ├── CustomerE.java
│   │   │       │                               │   └── OpportunityE.java
│   │   │       │                               ├── factory
│   │   │       │                               │   └── CustomerDomainFactory.java
│   │   │       │                               ├── repository
│   │   │       │                               │   ├── ContactRepository.java
│   │   │       │                               │   └── CustomerRepository.java
│   │   │       │                               ├── rule
│   │   │       │                               │   ├── extension
│   │   │       │                               │   │   ├── CustomerCGSRuleExt.java
│   │   │       │                               │   │   └── CustomerDDRuleExt.java
│   │   │       │                               │   └── extensionpoint
│   │   │       │                               │       └── CustomerRuleExtPt.java
│   │   │       │                               └── valueobject
│   │   │       │                                   ├── AddressV.java
│   │   │       │                                   ├── CompanyType.java
│   │   │       │                                   └── SourceType.java
│   │   │       └── resources
│   │   │           └── sample.properties
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── crm
│   │       │   │               └── sales
│   │       │   │                   └── domain
│   │       │   │                       └── customer
│   │       │   │                           ├── convertor
│   │       │   │                           │   ├── CustomerConvertor.class
│   │       │   │                           │   ├── extension
│   │       │   │                           │   │   ├── CustomerCGSConvertorExt.class
│   │       │   │                           │   │   └── CustomerDDConvertorExt.class
│   │       │   │                           │   └── extensionpoint
│   │       │   │                           │       └── CustomerConvertorExtPt.class
│   │       │   │                           ├── entity
│   │       │   │                           │   ├── ContactE.class
│   │       │   │                           │   ├── CustomerE.class
│   │       │   │                           │   └── OpportunityE.class
│   │       │   │                           ├── factory
│   │       │   │                           │   └── CustomerDomainFactory.class
│   │       │   │                           ├── repository
│   │       │   │                           │   ├── ContactRepository.class
│   │       │   │                           │   └── CustomerRepository.class
│   │       │   │                           ├── rule
│   │       │   │                           │   ├── extension
│   │       │   │                           │   │   ├── CustomerCGSRuleExt.class
│   │       │   │                           │   │   └── CustomerDDRuleExt.class
│   │       │   │                           │   └── extensionpoint
│   │       │   │                           │       └── CustomerRuleExtPt.class
│   │       │   │                           └── valueobject
│   │       │   │                               ├── AddressV.class
│   │       │   │                               ├── CompanyType.class
│   │       │   │                               └── SourceType.class
│   │       │   └── sample.properties
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-infrastructure
│   │   ├── crm-sales-infrastructure.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       ├── common
│   │   │       │                       │   ├── AppConstants.java
│   │   │       │                       │   └── BizCode.java
│   │   │       │                       ├── config
│   │   │       │                       │   └── HaloConfig.java
│   │   │       │                       ├── dao
│   │   │       │                       │   └── CustomerDOMapper.java
│   │   │       │                       └── tunnel
│   │   │       │                           ├── dataobject
│   │   │       │                           │   └── CustomerDO.java
│   │   │       │                           └── datatunnel
│   │   │       │                               ├── CustomerTunnelI.java
│   │   │       │                               └── impl
│   │   │       │                                   └── CustomerDBTunnel.java
│   │   │       └── resources
│   │   │           ├── customer.sql
│   │   │           └── mapper
│   │   │               └── CustomerDOMapper.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── crm
│   │       │   │               └── sales
│   │       │   │                   ├── common
│   │       │   │                   │   ├── AppConstants.class
│   │       │   │                   │   └── BizCode.class
│   │       │   │                   ├── config
│   │       │   │                   │   └── HaloConfig.class
│   │       │   │                   ├── dao
│   │       │   │                   │   └── CustomerDOMapper.class
│   │       │   │                   └── tunnel
│   │       │   │                       ├── dataobject
│   │       │   │                       │   └── CustomerDO.class
│   │       │   │                       └── datatunnel
│   │       │   │                           ├── CustomerTunnelI.class
│   │       │   │                           └── impl
│   │       │   │                               └── CustomerDBTunnel.class
│   │       │   ├── customer.sql
│   │       │   └── mapper
│   │       │       └── CustomerDOMapper.xml
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── crm-sales-start
│   │   ├── crm-sales-start.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── crm
│   │   │       │                   └── sales
│   │   │       │                       └── CrmSalesApplication.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── crm
│   │       │                   └── sales
│   │       │                       └── CrmSalesApplication.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── pom.xml
│   └── tree.md
├── ch3-1
│   ├── ch3-1-config-server
│   │   ├── README.MD
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch31ConfigServerApplication.java
│   │       │   └── resources
│   │       │       ├── bootstrap.yml
│   │       │       └── config
│   │       │           ├── eureka-client.yml
│   │       │           ├── eureka-server-peer1.yml
│   │       │           ├── eureka-server-peer2.yml
│   │       │           └── eureka-server-peer3.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31ConfigServerApplicationTests.java
│   ├── ch3-1-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch31EurekaClientApplication.java
│   │       │   │               └── controller
│   │       │   │                   └── QueryController.java
│   │       │   └── resources
│   │       │       ├── application.yml
│   │       │       └── bootstrap.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31EurekaClientApplicationTests.java
│   ├── ch3-1-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch31EurekaServerApplication.java
│   │       │   │               └── controller
│   │       │   │                   └── QueryController.java
│   │       │   └── resources
│   │       │       ├── application.yml
│   │       │       └── bootstrap.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch31EurekaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-2
│   ├── ch3-2-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch32EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch32EurekaClientApplicationTests.java
│   ├── ch3-2-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch322EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1a.yml
│   │       │       ├── application-zone1b.yml
│   │       │       ├── application-zone2a.yml
│   │       │       ├── application-zone2b.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch322EurekaServerApplicationTests.java
│   ├── ch3-2-zuul-gateway
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch322ZuulGatewayApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch322ZuulGatewayApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-3
│   ├── ch3-3-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch33EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       ├── application-zone3.yml
│   │       │       ├── application-zone4.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33EurekaClientApplicationTests.java
│   ├── ch3-3-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch33EurkeaServerApplication.java
│   │       │   │               └── config
│   │       │   │                   └── RegionConfig.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone2.yml
│   │       │       ├── application-zone3-region-west.yml
│   │       │       └── application-zone4-region-west.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33EurkeaServerApplicationTests.java
│   ├── ch3-3-zuul-gateway
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch33ZuulGatewayApplication.java
│   │       │   └── resources
│   │       │       ├── application-zone1.yml
│   │       │       ├── application-zone3-region-west.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch33ZuulGatewayApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-4
│   ├── ch3-4-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch34EurekaClientApplication.java
│   │       │   └── resources
│   │       │       ├── application-security.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch34EurekaClientApplicationTests.java
│   ├── ch3-4-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch34EurkeaServerApplication.java
│   │       │   │               └── config
│   │       │   │                   └── SecurityConfig.java
│   │       │   └── resources
│   │       │       ├── application-security.yml
│   │       │       └── application.yml
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch34EurkeaServerApplicationTests.java
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-5
│   ├── ch3-5-1-config-server
│   │   ├── ch3-5-1-config-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── config
│   │               ├── eureka-client.yml
│   │               ├── eureka-server-peer1.yml
│   │               ├── eureka-server-peer2.yml
│   │               └── eureka-server-peer3.yml
│   ├── ch3-5-1-eureka-client
│   │   ├── ch3-5-1-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch3-5-1-eureka-server
│   │   ├── ch3-5-1-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch3-5-2-eureka-client
│   │   ├── ch3-5-2-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           └── application.yml
│   ├── ch3-5-2-eureka-server
│   │   ├── ch3-5-2-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1a.yml
│   │           ├── application-zone1b.yml
│   │           ├── application-zone2a.yml
│   │           ├── application-zone2b.yml
│   │           └── application.yml
│   ├── ch3-5-2-zuul-gateway
│   │   ├── ch3-5-2-zuul-gateway.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           └── application.yml
│   ├── ch3-5-3-eureka-client
│   │   ├── ch3-5-3-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           ├── application-zone3.yml
│   │           ├── application-zone4.yml
│   │           └── application.yml
│   ├── ch3-5-3-eureka-server
│   │   ├── ch3-5-3-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-zone1.yml
│   │           ├── application-zone2.yml
│   │           ├── application-zone3-region-west.yml
│   │           └── application-zone4-region-west.yml
│   ├── ch3-5-4-eureka-client
│   │   ├── ch3-5-4-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-security.yml
│   │           └── application.yml
│   ├── ch3-5-4-eureka-server
│   │   ├── ch3-5-4-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-security.yml
│   │           └── application.yml
│   ├── ch3-5-5-eureka-client
│   │   ├── ch3-5-5-eureka-client.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-https.yml
│   │           ├── application.yml
│   │           ├── client.crt
│   │           ├── client.p12
│   │           └── server.crt
│   ├── ch3-5-5-eureka-server
│   │   ├── ch3-5-5-eureka-server.iml
│   │   └── target
│   │       └── classes
│   │           ├── application-https.yml
│   │           ├── application.yml
│   │           ├── client.crt
│   │           ├── server.crt
│   │           └── server.p12
│   ├── ch3-5-eureka-client
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               ├── Ch35EurekaClientApplication.java
│   │       │   │               └── config
│   │       │   │                   └── EurekaHttpsClientConfig.java
│   │       │   └── resources
│   │       │       ├── application-https.yml
│   │       │       ├── application.yml
│   │       │       ├── client.crt
│   │       │       ├── client.p12
│   │       │       └── server.crt
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch35EurekaClientApplicationTests.java
│   ├── ch3-5-eureka-server
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── cn
│   │       │   │       └── springcloud
│   │       │   │           └── book
│   │       │   │               └── Ch35EurekaServerApplication.java
│   │       │   └── resources
│   │       │       ├── application-https.yml
│   │       │       ├── application.yml
│   │       │       ├── client.crt
│   │       │       ├── server.crt
│   │       │       └── server.p12
│   │       └── test
│   │           └── java
│   │               └── cn
│   │                   └── springcloud
│   │                       └── book
│   │                           └── Ch35EurekaServerApplicationTests.java
│   ├── ch3-5.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch4-1
│   ├── ch4-1-gzip
│   │   ├── ch4-1-gzip.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── HelloFeignServiceConfig.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-1-hello
│   │   ├── ch4-1-hello.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   └── HelloFeignServiceConfig.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-1.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-2
│   ├── ch4-2-consumer
│   │   ├── ch4-2-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── ConsumerApplication.java
│   │   │   │   │                   ├── config
│   │   │   │   │                   │   ├── CoreAutoConfiguration.java
│   │   │   │   │                   │   └── FeignRequestInterceptor.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── ConsumerController.java
│   │   │   │   │                   ├── model
│   │   │   │   │                   │   └── OrderModel.java
│   │   │   │   │                   └── service
│   │   │   │   │                       └── UserFeignService.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-2-eureka-server
│   │   ├── ch4-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch4-2-provider
│   │   ├── ch4-2-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── ProviderApplication.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── OrderProviderController.java
│   │   │   │   │                   └── model
│   │   │   │   │                       └── OrderModel.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-2.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-3
│   ├── ch4-3-httpclient
│   │   ├── ch4-3-httpclient.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SpringCloudFeignApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloFeignController.java
│   │   │       │                   └── service
│   │   │       │                       └── HelloFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-3-okhttp
│   │   ├── ch4-3-okhttp.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   │   └── cn
│   │   │   │   │       └── springcloud
│   │   │   │   │           └── book
│   │   │   │   │               └── feign
│   │   │   │   │                   ├── SpringCloudFeignApplication.java
│   │   │   │   │                   ├── config
│   │   │   │   │                   │   └── FeignOkHttpConfig.java
│   │   │   │   │                   ├── controller
│   │   │   │   │                   │   └── HelloFeignController.java
│   │   │   │   │                   └── service
│   │   │   │   │                       └── HelloFeignService.java
│   │   │   │   └── resources
│   │   │   │       └── application.yml
│   │   │   └── test
│   │   │       └── java
│   │   │           └── cn
│   │   │               └── springcloud
│   │   │                   └── book
│   │   │                       ├── feign
│   │   │                       │   └── ConsumerApplicationTests.java
│   │   │                       └── gateway
│   │   │                           └── ConsumerApplicationTests.java
│   │   └── target
│   │       └── classes
│   │           └── application.yml
│   ├── ch4-3.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-4
│   ├── ch4-4-eureka-server
│   │   ├── ch4-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4-feign-file-server
│   │   ├── ch4-4-feign-file-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SCFeignFileServerApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── FeignUploadController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── SCFeignFileServerApplication.class
│   │       │                   └── controller
│   │       │                       └── FeignUploadController.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4-feign-upload-client
│   │   ├── ch4-4-feign-upload-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── SCFeignFileUploadApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   ├── FeignMultipartSupportConfig.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── FeignUploadController.java
│   │   │       │                   └── service
│   │   │       │                       └── FileUploadFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── SCFeignFileUploadApplication.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   ├── FeignMultipartSupportConfig.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   ├── controller
│   │       │                   │   └── FeignUploadController.class
│   │       │                   └── service
│   │       │                       └── FileUploadFeignService.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-4.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-5
│   ├── ch4-5-consumer
│   │   ├── ch4-5-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ConsumerApplication.java
│   │   │       │                   ├── Interceptor
│   │   │       │                   │   ├── FeignRequestInterceptor.java
│   │   │       │                   │   └── FeignTokenInterceptor.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   ├── model
│   │   │       │                   │   └── User.java
│   │   │       │                   └── service
│   │   │       │                       └── UserFeignService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ConsumerApplication.class
│   │       │                   ├── Interceptor
│   │       │                   │   ├── FeignRequestInterceptor.class
│   │       │                   │   └── FeignTokenInterceptor.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   ├── model
│   │       │                   │   └── User.class
│   │       │                   └── service
│   │       │                       └── UserFeignService.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5-eureka-server
│   │   ├── ch4-5-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5-provider
│   │   ├── ch4-5-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ProviderApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   └── model
│   │       │                       └── User.class
│   │       └── generated-sources
│   │           └── annotations
│   ├── ch4-5.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-6
│   ├── ch4-6-consumer
│   │   ├── ch4-6-consumer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ConsumerApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── ApplicationExceptionAdapter.java
│   │   │       │                   │   └── Swagger2Config.java
│   │   │       │                   └── controller
│   │   │       │                       └── UserController.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ConsumerApplication.class
│   │       │                   ├── config
│   │       │                   │   ├── ApplicationExceptionAdapter.class
│   │       │                   │   └── Swagger2Config.class
│   │       │                   └── controller
│   │       │                       └── UserController.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-eureka-server
│   │   ├── ch4-6-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       ├── classes
│   │       │   ├── bootstrap.yml
│   │       │   ├── cn
│   │       │   │   └── springcloud
│   │       │   │       └── book
│   │       │   │           └── eureka
│   │       │   │               └── EurekaServerApplication.class
│   │       │   └── logback.xml
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-provider
│   │   ├── ch4-6-provider.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── ProviderApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── UserController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── ProviderApplication.class
│   │       │                   ├── controller
│   │       │                   │   └── UserController.class
│   │       │                   └── model
│   │       │                       └── User.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6-provider-client
│   │   ├── ch4-6-provider-client.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── feign
│   │   │       │                   ├── model
│   │   │       │                   │   └── User.java
│   │   │       │                   └── service
│   │   │       │                       └── UserService.java
│   │   │       └── resources
│   │   │           └── application.yml
│   │   └── target
│   │       ├── classes
│   │       │   ├── application.yml
│   │       │   └── cn
│   │       │       └── springcloud
│   │       │           └── book
│   │       │               └── feign
│   │       │                   ├── model
│   │       │                   │   └── User.class
│   │       │                   └── service
│   │       │                       └── UserService.class
│   │       ├── generated-sources
│   │       │   └── annotations
│   │       └── maven-status
│   │           └── maven-compiler-plugin
│   │               └── compile
│   │                   └── default-compile
│   │                       ├── createdFiles.lst
│   │                       └── inputFiles.lst
│   ├── ch4-6.iml
│   ├── pom.xml
│   └── readme.md
├── ch5-1
│   ├── ch5-1-client-a
│   │   ├── ch5-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1-eureka-server
│   │   ├── ch5-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1-ribbon-loadbalancer
│   │   ├── ch5-1-ribbon-loadbalancer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── RibbonLoadbalancerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-1.iml
│   └── pom.xml
├── ch5-2
│   ├── ch5-2-client-a
│   │   ├── ch5-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2-eureka-server
│   │   ├── ch5-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2-ribbon-loadbalancer
│   │   ├── ch5-2-ribbon-loadbalancer.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── RibbonLoadbalancerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   ├── AvoidScan.java
│   │   │       │               │   └── TestConfiguration.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch5-2.iml
│   └── pom.xml
├── ch6-1
│   ├── ch6-1-client-service
│   │   ├── ch6-1-client-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── TestController.java
│   │   │       │               └── service
│   │   │       │                   ├── IUserService.java
│   │   │       │                   └── impl
│   │   │       │                       └── UserService.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-1-eureka-server
│   │   ├── ch6-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-1.iml
│   └── pom.xml
├── ch6-2
│   ├── ch6-2-consumer-service
│   │   ├── ch6-2-consumer-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ConsumerApplication.java
│   │   │       │               ├── controller
│   │   │       │               │   └── TestController.java
│   │   │       │               └── service
│   │   │       │                   ├── IUserService.java
│   │   │       │                   └── impl
│   │   │       │                       └── UserServiceFallback.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-2-eureka-server
│   │   ├── ch6-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-2-provider-service
│   │   ├── ch6-2-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ProviderApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-2.iml
│   └── pom.xml
├── ch6-3
│   ├── ch6-3-eureka-server
│   │   ├── ch6-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-3-hello-service
│   │   ├── ch6-3-hello-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── hello
│   │   │       │                   ├── HelloServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── HelloController.java
│   │   │       │                   └── service
│   │   │       │                       ├── IHelloService.java
│   │   │       │                       ├── dataservice
│   │   │       │                       │   └── ProviderService.java
│   │   │       │                       └── impl
│   │   │       │                           └── HelloService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-hystrix-dashboard
│   │   ├── ch6-3-hystrix-dashboard.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── HystrixDashboardApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-hystrix-exception-service
│   │   ├── ch6-3-hystrix-exception-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ex
│   │   │       │                   ├── HystrixExceptionApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── ExceptionController.java
│   │   │       │                   └── service
│   │   │       │                       └── dataservice
│   │   │       │                           ├── FeignErrorDecoder.java
│   │   │       │                           ├── PSFallbackBadRequestExpcetion.java
│   │   │       │                           ├── PSFallbackOtherExpcetion.java
│   │   │       │                           └── ProviderServiceCommand.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-provider-service
│   │   ├── ch6-3-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── provider
│   │   │       │                   ├── ProviderServiceApplication.java
│   │   │       │                   └── controller
│   │   │       │                       ├── ConsumerService.java
│   │   │       │                       └── ProviderController.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3-turbine
│   │   ├── ch6-3-turbine.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── TurbineApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-3.iml
│   └── pom.xml
├── ch6-4
│   ├── ch6-4-collapsing
│   │   ├── ch6-4-collapsing.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               ├── hystrix
│   │           │               │   ├── HystrixCollapsingApplication.java
│   │           │               │   ├── config
│   │           │               │   │   ├── CollapsingConfiguration.java
│   │           │               │   │   └── HystrixContextInterceptor.java
│   │           │               │   ├── controller
│   │           │               │   │   └── CollapsingController.java
│   │           │               │   └── service
│   │           │               │       ├── CollapsingService.java
│   │           │               │       └── ICollapsingService.java
│   │           │               └── provider
│   │           │                   └── model
│   │           │                       └── Animal.java
│   │           └── resources
│   │               ├── application.yml
│   │               └── bootstrap.yml
│   ├── ch6-4-eureka-server
│   │   ├── ch6-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch6-4-hystrix-cache
│   │   ├── ch6-4-hystrix-cache.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── hystrix
│   │   │       │                   ├── HystrixCacheApplication.java
│   │   │       │                   ├── config
│   │   │       │                   │   ├── CacheConfiguration.java
│   │   │       │                   │   └── CacheContextInterceptor.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── CacheController.java
│   │   │       │                   └── service
│   │   │       │                       ├── HelloCommand.java
│   │   │       │                       ├── HelloService.java
│   │   │       │                       └── IHelloService.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-4-hystrix-thread-context
│   │   ├── ch6-4-hystrix-thread-context.iml
│   │   ├── pom.xml
│   │   └── src
│   │       └── main
│   │           ├── java
│   │           │   └── cn
│   │           │       └── springcloud
│   │           │           └── book
│   │           │               └── hystrix
│   │           │                   ├── HystrixThreadContextApplication.java
│   │           │                   ├── config
│   │           │                   │   ├── HystrixThreadCallable.java
│   │           │                   │   ├── HystrixThreadContextConfiguration.java
│   │           │                   │   ├── HystrixThreadLocal.java
│   │           │                   │   └── SpringCloudHystrixConcurrencyStrategy.java
│   │           │                   ├── controller
│   │           │                   │   └── ThreadContextController.java
│   │           │                   └── service
│   │           │                       ├── IThreadContextService.java
│   │           │                       └── ThreadContextService.java
│   │           └── resources
│   │               ├── application.yml
│   │               └── bootstrap.yml
│   ├── ch6-4-provider-service
│   │   ├── ch6-4-provider-service.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── provider
│   │   │       │                   ├── ProviderServiceApplication.java
│   │   │       │                   ├── controller
│   │   │       │                   │   └── ProviderController.java
│   │   │       │                   └── model
│   │   │       │                       └── User.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           └── bootstrap.yml
│   ├── ch6-4.iml
│   └── pom.xml
├── ch7-1
│   ├── ch7-1-client-a
│   │   ├── ch7-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   ├── ClientAApplication.java
│   │   │       │                   └── controller
│   │   │       │                       └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch7-1-eureka-server
│   │   ├── ch7-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-1-zuul-server
│   │   ├── ch7-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── eureka
│   │   │       │                   └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── application.yml
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.yml
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch7-2
│   ├── ch7-2-client-a
│   │   ├── ch7-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch7-2-eureka-server
│   │   ├── ch7-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-2-zuul-server
│   │   ├── ch7-2-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-2.iml
│   └── pom.xml
├── ch7-3
│   ├── ch7-3-client-a
│   │   ├── ch7-3-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-client-b
│   │   ├── ch7-3-client-b.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientBApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-eureka-server
│   │   ├── ch7-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3-zuul-server
│   │   ├── ch7-3-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── application-example1.yml
│   │   │           ├── application-example2.yml
│   │   │           ├── application-example3.yml
│   │   │           ├── application-example4.yml
│   │   │           ├── application-example5.yml
│   │   │           ├── application-example6.yml
│   │   │           ├── application-example7.yml
│   │   │           ├── application-example8.yml
│   │   │           ├── application-example9.yml
│   │   │           ├── application.yml
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application-example1.yml
│   │           ├── application-example2.yml
│   │           ├── application-example3.yml
│   │           ├── application-example4.yml
│   │           ├── application-example5.yml
│   │           ├── application-example6.yml
│   │           ├── application-example7.yml
│   │           ├── application-example8.yml
│   │           ├── application-example9.yml
│   │           ├── application.yml
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch7-3.iml
│   └── pom.xml
├── ch8-1
│   ├── ch8-1-client-a
│   │   ├── ch8-1-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           └── bootstrap.yml
│   │   └── target
│   │       └── classes
│   │           └── bootstrap.yml
│   ├── ch8-1-eureka-server
│   │   ├── ch8-1-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-1-zuul-server
│   │   ├── ch8-1-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── SecurityConfiguration.java
│   │   │       │               ├── filter
│   │   │       │               │   ├── ErrorFilter.java
│   │   │       │               │   ├── FirstPreFilter.java
│   │   │       │               │   ├── PostFilter.java
│   │   │       │               │   ├── SecondPreFilter.java
│   │   │       │               │   └── ThirdPreFilter.java
│   │   │       │               └── groovy
│   │   │       │                   └── GroovyFilter.groovy
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-1.iml
│   └── pom.xml
├── ch8-2
│   ├── ch8-2-auth-server
│   │   ├── ch8-2-auth-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── AuthServerApplication.java
│   │   │       │               └── OAuthConfiguration.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-client-a
│   │   ├── ch8-2-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-eureka-server
│   │   ├── ch8-2-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2-zuul-server
│   │   ├── ch8-2-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-2.iml
│   └── pom.xml
├── ch8-3
│   ├── ch8-3-client-a
│   │   ├── ch8-3-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3-eureka-server
│   │   ├── ch8-3-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3-zuul-server
│   │   ├── ch8-3-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── ZuulServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-3.iml
│   └── pom.xml
├── ch8-4
│   ├── ch8-4-client-a
│   │   ├── ch8-4-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4-eureka-server
│   │   ├── ch8-4-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4-zuul-server
│   │   ├── ch8-4-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── DynamicZuulRouteLocator.java
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   └── DynamicZuulConfig.java
│   │   │       │               ├── dao
│   │   │       │               │   └── PropertiesDao.java
│   │   │       │               └── entity
│   │   │       │                   └── ZuulRouteEntity.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-4.iml
│   ├── mysql.sql
│   └── pom.xml
├── ch8-5
│   ├── ch8-5-client-a
│   │   ├── ch8-5-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5-eureka-server
│   │   ├── ch8-5-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5-zuul-server
│   │   ├── ch8-5-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── filter
│   │   │       │                   └── GrayFilter.java
│   │   │       └── resources
│   │   │           ├── application.properties
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── application.properties
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-5.iml
│   └── pom.xml
├── ch8-6
│   ├── ch8-6-eureka-server
│   │   ├── ch8-6-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-6-zuul-server
│   │   ├── ch8-6-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── ZuulUploadController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-6.iml
│   └── pom.xml
├── ch8-7
│   ├── ch8-7-client-a
│   │   ├── ch8-7-client-a.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ClientAApplication.java
│   │   │       │               └── controller
│   │   │       │                   └── TestController.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7-eureka-server
│   │   ├── ch8-7-eureka-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               └── EurekaServerApplication.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7-zuul-server
│   │   ├── ch8-7-zuul-server.iml
│   │   ├── pom.xml
│   │   ├── src
│   │   │   └── main
│   │   │       ├── java
│   │   │       │   └── cn
│   │   │       │       └── springcloud
│   │   │       │           └── book
│   │   │       │               ├── ZuulServerApplication.java
│   │   │       │               ├── config
│   │   │       │               │   ├── ApplicationExceptionAdapter.java
│   │   │       │               │   └── SwaggerConfig.java
│   │   │       │               └── filter
│   │   │       │                   ├── HeaderDeliverFilter.java
│   │   │       │                   └── ModifyRequestEntityFilter.java
│   │   │       └── resources
│   │   │           ├── bootstrap.yml
│   │   │           └── logback.xml
│   │   └── target
│   │       └── classes
│   │           ├── bootstrap.yml
│   │           └── logback.xml
│   ├── ch8-7.iml
│   └── pom.xml
├── pom.xml
└── tree.txt
```







