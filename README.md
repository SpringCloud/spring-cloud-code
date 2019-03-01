《重新定义Spring Cloud实战》
================
* 当当购买:http://product.dangdang.com/25348282.html
* 京东购买:https://item.jd.com/12447280.html

## 1. 前言
 
   随着互联网的快速普及，云计算近年来得到蓬勃发展，企业的IT环境和架构体系也逐渐发生变革，其中最典型的就是`过去的单体应用架构发展为当今流行的微服务架构`。微服务是一种架构风格，其优势是为软件应用开发带来很大的便利，让敏捷开发和复杂的企业应用快速持续交付成为可能。随着微服务架构的流行，很多企业纷纷使用微服务架构来搭建新的系统或者对历史系统进行重构，但是微服务架构的实施和落地会面临很大的挑战。`虽然微服务架构的解决方案很多，但是对于如何真正落地微服务架构，目前还没有公认的技术标准和规范`。幸运的是，业界已经有一些很有影响力的开源微服务解决方案，`比如2015年年初，Spring团队推出的Spring Cloud，其目标是成为Java领域微服务架构落地的标准。Spring Cloud经过高速迭代和发展，至今已经成为Java领域落地微服务架构的推荐解决方案，为企业IT架构变革保驾护航`。

   Spring Cloud是一个`优质的开源项目`，`它的稳健发展离不开众多开发人员的实践与反馈，开发人员通过一个社区化的平台去交流学习从而使Spring Cloud逐渐完善`。Spring Cloud发展到2016年，得到国内越来越多的人的关注，但是相应的学习交流平台和材料比较分散，这阻碍了Spring Cloud在我国的普及和发展。因此Spring Cloud中国社区应运而生。Spring Cloud中国社区 (http://springcloud.cn) 是国内基于Spring Cloud微服务体系创建的非盈利技术社区，是专为Spring Boot或Spring Cloud技术人员提供分享和交流服务的平台，目的是推动Spring Cloud在中国的普及和应用。关注Spring Cloud中国社区微信公众号，一起交流学习。
   
   ![](/doc/image/ewm.png)  
   
## 2.背景概述

   Spring Cloud中国社区(http://springcloud.cn) 是国内基于Spring Cloud微服务体系创建的非盈利技术社区。自2016年10月份创建以来，在北京，上海，深圳，成都等地举办了多次技术沙龙，提供技术交流平台,帮助数万开发者快速学习Spring Cloud并用于生产。为更好的推动Spring Cloud在中国的发展，让更多的开发者受益。社区针对Spring Cloud在国内的使用情况，结合国内企业使用Spring Cloud落地微服务架构遇到的问题给出实战解决方案，特推出此书。《重新定义Spring Cloud实战》封面如下图所示:

![](http://xujin.org/images/re/fm.png)

   本书基于`Spring Cloud的Finchley.RELEASE版编写`，由7位作者著，`共25章，共670页`，我们7位作者并不是Spring Cloud微服务落地的架构专家，我们只是Spring Cloud微服务架构的实践者，把我们自己的实践经验分享给大家，帮助大家解决学习和工作上遇到的问题。`三人行，必有我师焉，由于我们学识有限，难免会有不足之处，还请读者多多包涵，一起交流学习，共同进步`。

![](/doc/image/dy.jpg)


## 3.本书介绍

### 3.1 填坑记录

![](http://xujin.org/images/re/tkjl.png)

### 3.2 BATJ部分书评

过去十几年里，广义的“微服务”架构以其小团队快速创建和迭代服务带来的架构弹性、扩展性、敏捷性，天然匹配了互联网业务快速发展和变化的特点，在各大互联网公司取得了巨大的成功。时至云原生应用时代，已不再是是否采用微服务架构的问题，而是何时采用以及如何在生产上实战的问题。本书将如何基于Spring Cloud生态体系进行微服务实战的方方面面的细节都涵盖了，，从这个意义上来讲，确实做到了“重新定义”。

`—— 坤宇 Nacos开源项目创始人/阿里巴巴高级技术专家`



微服务以敏捷为目标，以降低复杂的系统结构为基础，带给我们更好的系统可用性和稳定性。Spring Cloud作为一套完善的微服务治理的典型框架，涵盖了微服务治理的方方面面。本书详细介绍了Spring Cloud的每一个核心模块，以理论与实际相结合的方式，透彻地讲述了Spring Cloud的精髓，是每一位奋战在服务化领域一线的工程师、架构师的*选技术书籍。

`——李艳鹏 蚂蚁金服高级技术专家/《分布式服务架构》《可伸缩服务架构》作者
`


本书可以说是后端架构师的进阶宝典，全面地讲解了如何打造一套强大、健壮的微服务体系，深入分析了涉及到的各个组件。*难得的是，书中结合了作者多年积累的架构经验，分析了各种组件适用的场景，平实地说明了实际使用中的各种考量和细节优化，简直是奋斗在一线的工程师的心血结晶。任何想掌握大型后端架构的工程师，无论使用什么技术框架，都能从本书获益匪浅。

` ——李双涛 饿了么中间件资深架构师`



Spring Cloud已然成为Java领域应用微服务化的*选框架，但国内一直缺少全面论述Spring Cloud商用实践相关的书籍。本书围绕Spring Cloud框架中的服务注册发现、服务路由、服务网关、分布式配置、服务治理、容器化及微服务设计等关键领域进行了深入浅出的讲解，并给予了大量的真实应用案例，新手和老手都可以从中受益良多。作者作为Spring Cloud中国的资深专家，对于Spring Cloud及微服务有着深刻的架构和实战经验，值得信赖。

`——单家骏 腾讯中间件高级工程师`


在微服务体系中，Spring Cloud是目前最热门的构建微服务体系的解决方案，它提供了构建微服务架构的一些基础设施。本书内容上覆盖了Spring Cloud的一些主要组件，不仅在如何使用上做了详细的介绍，也从原理上深入浅出地剖析了其中的技术要点，同时部分组件也跟周边的一些开源项目进行了对比，且提供了一些原理分析和相关的示例，是一本不可多得的Spring Cloud实战书籍。新手和有微服务实践经验的读者都能从书中得到一些不一样的收获。

`——张艺辰 腾讯高级研发工程师`

本书不仅对Spring Cloud各核心组件进行了细致入微的介绍，同时也跳出了框架本身，为微服务的实施和分布式架构所面临的基本问题交出了Spring Cloud式答卷，是开发者快速掌握Spring Cloud技术栈的神兵利器。不仅如此，本书还凝聚着Spring Cloud中国社区的智慧结晶，让我们看到了国人在开源领域的研发力量， 可喜可贺。

`——王鸿飞 百度高级研发工程师`

在微服务如火如荼的今天，各种微服务框架层出不穷，而Spring Cloud无疑是那颗最闪亮的星。从Spring Framework到Spring Boot，再到如今的Spring Cloud，Spring全家桶给众多程序员带来了真正的春天。由于分布式和服务化是极具挑战的任务，因此Spring Cloud也不可避免的愈加复杂。Spring CLoud中国社区为Spring Cloud的普及做出了巨大的贡献，并迅速的降低了语言问题所带来的学习门槛。这本书由Spring CLoud中国社区倾力打造，书籍涵盖了Spring Cloud的服务发现、网关、熔断器、配置、全链路监控等最核心组件，并很接地气地详述了Dubbo向Spring Cloud迁移以及Spring Cloud与分布式事务相关内容，值得一看。

`——张亮 京东金融数据研发负责人/分布式数据库中间件Sharding-Sphere负责人`

Spring Cloud提供了完整的微服务技术体系，可以帮助开发者快速地实现架构升级。《重新定义Spring Cloud实战》一书完整地介绍了Spring Cloud中各个组件的使用方法并深度剖析了其中的原理，文章深入浅出帮助开发者快速掌握和理解Spring Cloud。

`——李艺恒 腾讯研发工程师 `

### 3.3 内容简介

这是一本实践与理论并重、广度与深度兼顾的Spring Cloud生产实践开发指南，由Spring Cloud中国社区倾力打造，作者来自阿里、蚂蚁金服、京东金融等企业，本书针对Spring Cloud在国内的使用情况，结合国内企业使用Spring Cloud落地微服务架构遇到的问题，提出可落地的解决方案。

本书内容有3大特色：

* `足够广`：详细讲解了Spring Cloud的核心常用组件以及Spring Cloud的增强生态，针对生产实践中常见问题给出可落地的最佳实践方案，无论您是初学者还是开发人员，还是架构师，都能从此书获益。

* `有深度`：本书对涉及的Spring Cloud组件按照从入门、进阶、实战、扩展增强的顺序循序渐进进行剖析和讲解,帮助作者知其然并知其所以然，授之以渔。

* `重实践`：注重生产实践，通过案例驱动，给出优秀的生产实践方案和优秀的生产配置，帮助读者快速落地企业微服务架构。

全书共25章，分为三个部分：

* 第一部分 核心组件篇（第1~10章）
  主要讲解Spring Cloud的核心组件。首先从应用架构的发展历程讲起，介绍了微服务出现的背景，并对微服务架构的落地提出了相应的解决方案；然后分别详细介绍了Spring Cloud微服务体系中的核心常用组件，如Eureka、Feign、Ribbon、Hystrix、Zuul等；最后通过一个综合案例将前面介绍的组件连接起来，帮助大家融会贯通。

* 第二部分 进阶实战篇（第11~18章）
  在核心组件的基础上，对Config、Consul、认证和鉴权、全链路监控以及对Spring Cloud生态圈中第二代网关Spring Cloud Gateway进行了详细阐述，循序渐进、案例驱动，帮助读者加深对组件的理解和运用，更好地掌握相关内容运用于生产实践。

* 第三部分 解决方案篇（第19~25章）
   主要从解决方案着手，内容包括Spring Cloud与gRPC的整合方式、版本控制与灰度发布、Spring Cloud容器化、Dubbo向Spring Cloud的迁移、分布式事务、领域驱动等生产级实用解决方案，为企业IT架构微服务化和变革保驾护航。

### 3.4 推荐理由

* 本书由Spring Cloud社区官方撰写，核心成员来自原阿里、蚂蚁金服、京东金融等互联网企业，经验丰富。

* 本书内容有3大特色：宽度足够广、深度足够深，而且立足于生产实践，直接从生产实践出发，包含大量生产实践的配置

* 本书得到了来自阿里、腾讯、百度、京东等大型互联网企业的近10位专家的鼎力推荐。


### 3.5 读者反馈

https://github.com/SpringCloud/spring-cloud-code/issues/1


### 3.6 源码相关

书籍目录：https://github.com/SpringCloud/spring-cloud-catalog

源码地址:https://github.com/SpringCloud/spring-cloud-code

http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html

* 由于聚合工程很多，Maven内存如果不足，在/spring-cloud-code/pom.xml设置如下，欢迎**Star**。
![](/doc/image/szm1.jpg)

* IDE中配置如下:
![](/doc/image/sz_maven.jpg)

工程明细

ch是章节的简称，ch10表示第十章，ch10-1表示第十章的第一个案例工程，

```
├── ch10-1
│   ├── ch10-1-common
│   ├── ch10-1-config-server
│   ├── ch10-1-data-service
│   ├── ch10-1-eureka-server
│   ├── ch10-1-hystrix-dashboard
│   ├── ch10-1-user-service
│   ├── ch10-1-zuul-server
│   ├── ch10-1.iml
│   └── pom.xml
├── ch11-1
│   ├── ch11-1-config-client
│   ├── ch11-1-config-server
│   ├── ch11-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch11-2
│   ├── ch11-2-config-client-refresh
│   ├── ch11-2-config-server
│   ├── ch11-2.iml
│   └── pom.xml
├── ch11-3
│   ├── ch11-3-config-client-bus-refresh
│   ├── ch11-3-config-client-bus-refresh-second
│   ├── ch11-3-config-server-bus
│   ├── ch11-3.iml
│   └── pom.xml
├── ch12-1
│   ├── ch12-1-config-client-placeholders
│   ├── ch12-1-config-server-placeholders
│   ├── ch12-1.iml
│   └── pom.xml
├── ch12-10
│   ├── ch12-10-config-client-apollo
│   ├── ch12-10-config-client-apollo2
│   ├── ch12-10-eureka-server
│   ├── ch12-10-gateway-zuul-apollo
│   ├── ch12-10.iml
│   └── pom.xml
├── ch12-2
│   ├── ch12-2-config-client-multiple-repositories
│   ├── ch12-2-config-server-multiple-repositories
│   ├── ch12-2.iml
│   └── pom.xml
├── ch12-3
│   ├── ch12-3-config-client-db
│   ├── ch12-3-config-server-db
│   ├── ch12-3.iml
│   └── pom.xml
├── ch12-4
│   ├── ch12-4-config-client-mongodb
│   ├── ch12-4-config-server-mongodb
│   ├── ch12-4.iml
│   └── pom.xml
├── ch12-5
│   ├── ch12-5-config-client-auto-refresh
│   ├── ch12-5-config-client-refresh-autoconfig
│   ├── ch12-5-config-server
│   ├── ch12-5.iml
│   └── pom.xml
├── ch12-6
│   ├── ch12-6-config-client-fallback
│   ├── ch12-6-config-client-fallback-autoconfig
│   ├── ch12-6-config-server
│   ├── ch12-6.iml
│   └── pom.xml
├── ch12-7
│   ├── ch12-7-config-client-auth-jwt
│   ├── ch12-7-config-client-jwt
│   ├── ch12-7-config-server-auth-jwt
│   ├── ch12-7.iml
│   └── pom.xml
├── ch12-8
│   ├── ch12-8-config-client-high-availability
│   ├── ch12-8-config-client-high-availability-autoconfig
│   ├── ch12-8-config-server
│   ├── ch12-8.iml
│   └── pom.xml
├── ch12-9
│   ├── ch12-9-config-client
│   ├── ch12-9-config-server-high-availability
│   ├── ch12-9-eureka-server
│   ├── ch12-9.iml
│   └── pom.xml
├── ch13-1
│   ├── README.md
│   ├── ch13-1-consul-config
│   ├── ch13-1-consul-consumer
│   ├── ch13-1-consul-provider
│   ├── ch13-1.iml
│   └── pom.xml
├── ch14-1
│   ├── README.md
│   ├── ch14-1-consul-register
│   ├── ch14-1.iml
│   └── pom.xml
├── ch14-2
│   ├── ch14-2-consul-consumer-discoveryclient
│   ├── ch14-2-consul-consumer-ribbon
│   ├── ch14-2-consul-provider-tag-1
│   ├── ch14-2-consul-provider-tag-2
│   ├── ch14-2-cosul-provider-tag-1
│   ├── ch14-2.iml
│   └── pom.xml
├── ch14-3
│   ├── ch14-3-consul-config-customize
│   ├── ch14-3.iml
│   └── pom.xml
├── ch14-4
│   ├── ch14-4-consul-override-consumer
│   ├── ch14-4-consul-override-provider-tag1
│   ├── ch14-4-consul-override-provider-tag2
│   ├── ch14-4.iml
│   └── pom.xml
├── ch14-5
│   ├── ch14-5-consul-override-consumer
│   ├── ch14-5-consul-override-consumer-new
│   ├── ch14-5-consul-provider1
│   ├── ch14-5-consul-provider2
│   ├── ch14-5.iml
│   └── pom.xml
├── ch15-1
│   ├── ch15-1-client-service
│   ├── ch15-1-core-service
│   ├── ch15-1-eureka-service
│   ├── ch15-1-gateway
│   ├── ch15-1-provider-service
│   ├── ch15-1.iml
│   └── pom.xml
├── ch16-1
│   ├── ch16-1-sleuth-consumer
│   ├── ch16-1-sleuth-provider
│   ├── ch16-1.iml
│   └── pom.xml
├── ch16-2
│   ├── ch16-2-sleuth-consumer
│   ├── ch16-2-sleuth-provider
│   ├── ch16-2.iml
│   └── pom.xml
├── ch16-3
│   ├── ch16-3-eureka-server-skywalking
│   ├── ch16-3-script
│   ├── ch16-3-service-a
│   ├── ch16-3-service-b
│   ├── ch16-3-zuul-skywalking
│   ├── ch16-3.iml
│   └── pom.xml
├── ch17-1
│   ├── ch17-1-1-gateway
│   ├── ch17-1-2-gateway
│   ├── ch17-1.iml
│   └── pom.xml
├── ch17-2
│   ├── ch17-2-1-gateway
│   ├── ch17-2-2-gateway
│   ├── ch17-2-3-gateway
│   ├── ch17-2-4-gateway
│   ├── ch17-2-5-gateway
│   ├── ch17-2-6-gateway
│   ├── ch17-2-7-gateway
│   ├── ch17-2-8-gateway
│   ├── ch17-2-9-gateway
│   ├── ch17-2-service
│   ├── ch17-2.iml
│   └── pom.xml
├── ch17-3
│   ├── ch17-3-1-gateway
│   ├── ch17-3-2-gateway
│   ├── ch17-3-3-gateway
│   ├── ch17-3-4-gateway
│   ├── ch17-3-5-gateway
│   ├── ch17-3-6-gateway
│   ├── ch17-3-7-gateway
│   ├── ch17-3-service
│   ├── ch17-3.iml
│   └── pom.xml
├── ch18-1
│   ├── ch18-1-consumer
│   ├── ch18-1-eureka
│   ├── ch18-1-gateway
│   ├── ch18-1-provider
│   ├── ch18-1.iml
│   └── pom.xml
├── ch18-2
│   ├── ch18-2-gateway
│   ├── ch18-2-provider
│   ├── ch18-2.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch18-3
│   ├── ch18-3-gateway
│   ├── ch18-3-provider
│   ├── ch18-3.iml
│   └── pom.xml
├── ch18-4
│   ├── ch18-4-eureka
│   ├── ch18-4-gateway-https
│   ├── ch18-4-service-a
│   ├── ch18-4-service-b
│   ├── ch18-4.iml
│   ├── pom.xml
│   └── reademe.md
├── ch18-5
│   ├── ch18-5-eureka
│   ├── ch18-5-gateway
│   ├── ch18-5-service
│   ├── ch18-5.iml
│   └── pom.xml
├── ch18-6
│   ├── ch18-6-1-gateway
│   ├── ch18-6-2-gateway
│   ├── ch18-6-3-gateway
│   ├── ch18-6-provider
│   ├── ch18-6.iml
│   └── pom.xml
├── ch18-7
│   ├── ch18-7-gateway
│   ├── ch18-7.iml
│   ├── pom.xml
│   └── readme.md
├── ch19-1
│   ├── ch19-1.iml
│   ├── pom.xml
│   └── src
├── ch19-2
│   ├── ch19-2.iml
│   ├── grpc-lib-1
│   ├── grpc-simple-client
│   ├── grpc-simple-server
│   └── pom.xml
├── ch2-1
│   ├── ch2-1-eureka-client
│   ├── ch2-1-eureka-server
│   ├── ch2-1.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch20
│   ├── ch20.iml
│   ├── cloud-eureka-server
│   ├── cloud-grpc-client
│   ├── cloud-grpc-server
│   ├── grpc-lib
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch21-1
│   ├── ch21-1-discovery-console
│   ├── ch21-1-eureka-server
│   ├── ch21-1-original-service
│   ├── ch21-1-zuul-server
│   ├── ch21-1.iml
│   └── pom.xml
├── ch22-1
│   ├── ch22-1-2-dockerfile
│   ├── ch22-1-3-jdk8-docker
│   ├── ch22-1-4-jdk10-docker
│   ├── ch22-1.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-2
│   ├── ch22-2-1-config-server
│   ├── ch22-2-2-eureka-server
│   ├── ch22-2-3-gateway
│   ├── ch22-2-4-turbine
│   ├── ch22-2-5-spring-admin
│   ├── ch22-2-6-biz-service
│   ├── ch22-2.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch22-3
│   ├── ch22-3-1
│   ├── ch22-3-2-example-service
│   ├── ch22-3-3-example-service
│   ├── ch22-3.iml
│   ├── metrics-server-0.2.1
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-1
│   ├── ch23-1.iml
│   ├── demo-consumer
│   ├── demo-provider
│   ├── dubbo-provider-api
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch23-2
│   ├── ch23-2.iml
│   ├── demo-dubbo-consumer
│   ├── demo-dubbo-provider
│   ├── demo-dubbo-provider-api
│   ├── eureka-server
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch24
│   ├── ch24-jta-atomikos
│   ├── ch24-saga-servicecomb
│   ├── ch24-tcc-rest
│   ├── ch24.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch25
│   ├── LICENSE
│   ├── README.md
│   ├── ch25.iml
│   ├── crm-sales-app
│   ├── crm-sales-client
│   ├── crm-sales-consumer
│   ├── crm-sales-domain
│   ├── crm-sales-infrastructure
│   ├── crm-sales-start
│   ├── pom.xml
│   └── tree.md
├── ch3-1
│   ├── ch3-1-config-server
│   ├── ch3-1-eureka-client
│   ├── ch3-1-eureka-server
│   ├── ch3-1.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-2
│   ├── ch3-2-eureka-client
│   ├── ch3-2-eureka-server
│   ├── ch3-2-zuul-gateway
│   ├── ch3-2.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-3
│   ├── ch3-3-eureka-client
│   ├── ch3-3-eureka-server
│   ├── ch3-3-zuul-gateway
│   ├── ch3-3.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-4
│   ├── ch3-4-eureka-client
│   ├── ch3-4-eureka-server
│   ├── ch3-4.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch3-5
│   ├── ch3-5-eureka-client
│   ├── ch3-5-eureka-server
│   ├── ch3-5.iml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── ch4-1
│   ├── ch4-1-gzip
│   ├── ch4-1-hello
│   ├── ch4-1.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-2
│   ├── ch4-2-consumer
│   ├── ch4-2-eureka-server
│   ├── ch4-2-provider
│   ├── ch4-2.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-3
│   ├── ch4-3-httpclient
│   ├── ch4-3-okhttp
│   ├── ch4-3.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-4
│   ├── ch4-4-eureka-server
│   ├── ch4-4-feign-file-server
│   ├── ch4-4-feign-upload-client
│   ├── ch4-4.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-5
│   ├── ch4-5-consumer
│   ├── ch4-5-eureka-server
│   ├── ch4-5-provider
│   ├── ch4-5.iml
│   ├── pom.xml
│   └── readme.md
├── ch4-6
│   ├── ch4-6-consumer
│   ├── ch4-6-eureka-server
│   ├── ch4-6-provider
│   ├── ch4-6-provider-client
│   ├── ch4-6.iml
│   ├── pom.xml
│   └── readme.md
├── ch5-1
│   ├── ch5-1-client-a
│   ├── ch5-1-eureka-server
│   ├── ch5-1-ribbon-loadbalancer
│   ├── ch5-1.iml
│   └── pom.xml
├── ch5-2
│   ├── ch5-2-client-a
│   ├── ch5-2-eureka-server
│   ├── ch5-2-ribbon-loadbalancer
│   ├── ch5-2.iml
│   └── pom.xml
├── ch6-1
│   ├── ch6-1-client-service
│   ├── ch6-1-eureka-server
│   ├── ch6-1.iml
│   └── pom.xml
├── ch6-2
│   ├── ch6-2-consumer-service
│   ├── ch6-2-eureka-server
│   ├── ch6-2-provider-service
│   ├── ch6-2.iml
│   └── pom.xml
├── ch6-3
│   ├── ch6-3-eureka-server
│   ├── ch6-3-hello-service
│   ├── ch6-3-hystrix-dashboard
│   ├── ch6-3-hystrix-exception-service
│   ├── ch6-3-provider-service
│   ├── ch6-3-turbine
│   ├── ch6-3.iml
│   └── pom.xml
├── ch6-4
│   ├── ch6-4-collapsing
│   ├── ch6-4-eureka-server
│   ├── ch6-4-hystrix-cache
│   ├── ch6-4-hystrix-thread-context
│   ├── ch6-4-provider-service
│   ├── ch6-4.iml
│   └── pom.xml
├── ch7-1
│   ├── ch7-1-client-a
│   ├── ch7-1-eureka-server
│   ├── ch7-1-zuul-server
│   ├── ch7-1.iml
│   ├── pom.xml
│   └── reademe.txt
├── ch7-2
│   ├── ch7-2-client-a
│   ├── ch7-2-eureka-server
│   ├── ch7-2-zuul-server
│   ├── ch7-2.iml
│   └── pom.xml
├── ch7-3
│   ├── ch7-3-client-a
│   ├── ch7-3-client-b
│   ├── ch7-3-eureka-server
│   ├── ch7-3-zuul-server
│   ├── ch7-3.iml
│   └── pom.xml
├── ch8-1
│   ├── ch8-1-client-a
│   ├── ch8-1-eureka-server
│   ├── ch8-1-zuul-server
│   ├── ch8-1.iml
│   └── pom.xml
├── ch8-2
│   ├── ch8-2-auth-server
│   ├── ch8-2-client-a
│   ├── ch8-2-eureka-server
│   ├── ch8-2-zuul-server
│   ├── ch8-2.iml
│   └── pom.xml
├── ch8-3
│   ├── ch8-3-client-a
│   ├── ch8-3-eureka-server
│   ├── ch8-3-zuul-server
│   ├── ch8-3.iml
│   └── pom.xml
├── ch8-4
│   ├── ch8-4-client-a
│   ├── ch8-4-eureka-server
│   ├── ch8-4-zuul-server
│   ├── ch8-4.iml
│   ├── mysql.sql
│   └── pom.xml
├── ch8-5
│   ├── ch8-5-client-a
│   ├── ch8-5-eureka-server
│   ├── ch8-5-zuul-server
│   ├── ch8-5.iml
│   └── pom.xml
├── ch8-6
│   ├── ch8-6-eureka-server
│   ├── ch8-6-zuul-server
│   ├── ch8-6.iml
│   └── pom.xml
├── ch8-7
│   ├── ch8-7-client-a
│   ├── ch8-7-eureka-server
│   ├── ch8-7-zuul-server
│   ├── ch8-7.iml
│   └── pom.xml
├── pom.xml
```
>tree -L 2 >>tree.txt



### 3.7 作者介绍

1. 许进:Spring Cloud中国社区创始人，阿里原资深工程师，花名玹霖，专注于基础架构与中间件研发，曾就职于唯品会平台架构部和饿了么。个人网站：http://xujin.org。

2. 钟尊发:Spring Cloud中国社区联合创始人，现就职于京东金融，对微服务有深入研究。

3. 叶志远:Spring Cloud中国社区联合创始人，现就职于蚂蚁金服，花名梓尧。CSDN博客专家，开源社区活跃者，国内Spring Cloud早期实践者

4. 方志朋:Spring Cloud中国社区联合创始人，硕士学历，《深入理解Spring Cloud与微服务构建》作者，CSDN博客专家（阅读量600万+），在社区具有较高活跃度与影响力。

5. 蔡波斯:拥有多年Java开发经验，曾就职于美团、腾讯。国内Spring Cloud领域的早期实践者，现在金融行业从事FinTech相关研发

6. 郭芳碧:多年微服务实践经验，现任职于某互联网金融公司中间件部门。

7. 朱德明:拥有10年Java开发经验，多年技术架构和解决方案经验，现任灵雀云微服务架构师，在微服务领域有着丰富的落地经验，曾任某创业公司技术负责人。

## Stargazers over time

[![Stargazers over time](https://starcharts.herokuapp.com/SpringCloud/spring-cloud-code.svg)](https://starcharts.herokuapp.com/SpringCloud/spring-cloud-code)
      

