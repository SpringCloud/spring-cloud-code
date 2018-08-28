```
mvn clean package

docker run -p 8888:8080 --rm \
-e JAVA_OPTS='-server -Xmx1g' \
-e PROFILE='jdbc' \
-e SERVER_PORT=8080 \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-2-1-config-server:0.0.1-SNAPSHOT
```