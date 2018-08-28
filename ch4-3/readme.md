
## 更换Feign默认的Client

## 测试

### 1.启动访问-ch4-3-httpclient
http://localhost:8010/search/github?str=spring-cloud-openfeign

### 2.启动访问-ch4-3-okhttp
http://localhost:8011/search/github?str=spring-cloud-openfeign
实际调用的是:
https://api.github.com/search/repositories?q=spring-cloud-openfeign





