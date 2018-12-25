## 启动config-server
新开命令行窗口，cd到ch3-1/ch3-1-config-server目录
```
mvn spring-boot:run
```

## 按profile启动eureka server
### peer1
新开命令行窗口，cd到ch3-1/ch3-1-eureka-server目录
```
mvn spring-boot:run -Dspring.profiles.active=peer1
```
>按这个profile启动时，会出现如下的error日志
```
2018-12-25 18:26:11.519 ERROR 15853 --- [           main] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_EUREKA-SERVER/10.2.240.30:eureka-server:8761 - was unable to refresh its cache! status = Cannot execute request on any known server

com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:112) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.DiscoveryClient.getAndStoreFullRegistry(DiscoveryClient.java:1051) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.DiscoveryClient.fetchRegistry(DiscoveryClient.java:965) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:414) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:269) [eureka-client-1.9.2.jar:1.9.2]
	at org.springframework.cloud.netflix.eureka.CloudEurekaClient.<init>(CloudEurekaClient.java:63) [spring-cloud-netflix-eureka-client-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration.eurekaClient(EurekaClientAutoConfiguration.java:269) [spring-cloud-netflix-eureka-client-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$ee9298f0.CGLIB$eurekaClient$0(<generated>) [spring-cloud-netflix-eureka-client-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$ee9298f0$$FastClassBySpringCGLIB$$c9690964.invoke(<generated>) [spring-cloud-netflix-eureka-client-2.0.0.RELEASE.jar:2.0.0.RELEASE]
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) [spring-core-5.0.7.RELEASE.jar:5.0.7.RELEASE]
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:361) [spring-context-5.0.7.RELEASE.jar:5.0.7.RELEASE]
	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$ee9298f0.eurekaClient(<generated>) [spring-cloud-netflix-eureka-client-2.0.0.RELEASE.jar:2.0.0.RELEASE]

2018-12-25 18:30:12.759 ERROR 15853 --- [nfoReplicator-0] c.n.d.s.t.d.RedirectingEurekaHttpClient  : Request execution error

com.sun.jersey.api.client.ClientHandlerException: java.net.ConnectException: Connection refused (Connection refused)
	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler.handle(ApacheHttpClient4Handler.java:187) ~[jersey-apache-client4-1.19.1.jar:1.19.1]
	at com.sun.jersey.api.client.filter.GZIPContentEncodingFilter.handle(GZIPContentEncodingFilter.java:123) ~[jersey-client-1.19.1.jar:1.19.1]
	at com.netflix.discovery.EurekaIdentityHeaderFilter.handle(EurekaIdentityHeaderFilter.java:27) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.sun.jersey.api.client.Client.handle(Client.java:652) ~[jersey-client-1.19.1.jar:1.19.1]
	at com.sun.jersey.api.client.WebResource.handle(WebResource.java:682) ~[jersey-client-1.19.1.jar:1.19.1]
	at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74) ~[jersey-client-1.19.1.jar:1.19.1]
	at com.sun.jersey.api.client.WebResource$Builder.post(WebResource.java:570) ~[jersey-client-1.19.1.jar:1.19.1]
	at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.register(AbstractJerseyEurekaHttpClient.java:56) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.MetricsCollectingEurekaHttpClient.execute(MetricsCollectingEurekaHttpClient.java:73) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.executeOnNewServer(RedirectingEurekaHttpClient.java:118) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.execute(RedirectingEurekaHttpClient.java:79) ~[eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:120) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.DiscoveryClient.register(DiscoveryClient.java:829) [eureka-client-1.9.2.jar:1.9.2]
	at com.netflix.discovery.InstanceInfoReplicator.run(InstanceInfoReplicator.java:121) [eureka-client-1.9.2.jar:1.9.2]
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_151]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_151]
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180) [na:1.8.0_151]
	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293) [na:1.8.0_151]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_151]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_151]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_151]
```
>这是因为这里为了后续演示扩容方便，peer1的fetchRegistry及fetchRegistry的属性设置为true的缘故，如果是standalone的eureka server，不想看到该报错，可以自己设置false


### peer2
新开命令行窗口，cd到ch3-1/ch3-1-eureka-server目录
```
mvn spring-boot:run -Dspring.profiles.active=peer2
```

### peer3
新开命令行窗口，cd到ch3-1/ch3-1-eureka-server目录
```
mvn spring-boot:run -Dspring.profiles.active=peer3
```