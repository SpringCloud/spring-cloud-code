## local build & run
```
mvn clean package -Ddockerfile.skip

CONFIG_SERVER_HOST=localhost CONFIG_SERVER_PORT=8888 SERVER_PORT=8761 EUREKA_SERVER_HOST=localhost EUREKA_SERVER_PORT=8762 java -jar target/ch22-2-2-eureka-server-0.0.1-SNAPSHOT.jar

CONFIG_SERVER_HOST=localhost CONFIG_SERVER_PORT=8888 SERVER_PORT=8762 EUREKA_SERVER_HOST=localhost EUREKA_SERVER_PORT=8761 java -jar target/ch22-2-2-eureka-server-0.0.1-SNAPSHOT.jar
```

## docker
```
mvn clean package
docker run -p 8761:8080 --rm \
-e JAVA_OPTS='-server -Xmx1g' \
-e PROFILE='default' \
-e SERVER_PORT=8080 \
-e CONFIG_SERVER_HOST=192.168.99.100 \
-e CONFIG_SERVER_PORT=8888 \
-e EUREKA_SERVER_HOST=192.168.99.100 \
-e EUREKA_SERVER_PORT=8762 \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-2-2-eureka-server:0.0.1-SNAPSHOT


docker run -p 8762:8080 --rm \
-e JAVA_OPTS='-server -Xmx1g' \
-e PROFILE='default' \
-e SERVER_PORT=8080 \
-e CONFIG_SERVER_HOST=192.168.99.100 \
-e CONFIG_SERVER_PORT=8888 \
-e EUREKA_SERVER_HOST=192.168.99.100 \
-e EUREKA_SERVER_PORT=8761 \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-2-2-eureka-server:0.0.1-SNAPSHOT
```