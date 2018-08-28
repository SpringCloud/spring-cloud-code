
## 快速开始

````
feign.RetryableException: Read timed out executing GET http://crm-sales-provider/list?operaterIsNotNeeded=false
	at feign.FeignException.errorExecuting(FeignException.java:67)
	at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:104)
	at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:76)
	at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:103)
	at com.sun.proxy.$Proxy85.findByCriteria(Unknown Source)
	at cn.springcloud.book.crm.sales.CustomerController.list(CustomerController.java:54)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:209)
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:136)
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:102)
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:877)
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:783)
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:991)
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:925)
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:974)
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:866)
````

### 测试地址

应用启动后访问测试地址

新增一个客户（随机生成）：

http://localhost:8080/customer/add 

````
{"errCode":null,"errMessage":null,"success":true}
````

查询客户列表：

http://localhost:8080/customer/list 

````
{"errCode":null,"errMessage":null,"total":5,"data":[{"extValues":{},"customerId":"832802","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"836874","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"838993","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"871459","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null},{"extValues":{},"customerId":"89538","memberId":null,"customerName":null,"customerType":null,"companyName":"杭州XX公司","source":null}],"success":true}
````

主要工作是在脚手架的基础上，加入web功能和mysql连接