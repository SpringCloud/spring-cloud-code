## build
```
mvn clean package
```

## docker run
```
docker run -p 8080:8080 --rm \
-e JAVA_OPTS='-server -Xmx256m' \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-3-2-example-service:0.0.1-SNAPSHOT
```

## kubernetes
```
minikube start
kubectl create -f example-service-rc.yml
```

## wrk
```
wrk -t8 -c200 -d30s http://192.168.99.101:8080/actuator/metrics
```