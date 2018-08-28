## set jdk 10 to build
```
jenv local 10
jenv enable-plugin maven
```

## build
```
mvn clean package
docker build --build-arg JAR_FILE=ch22-1-4-jdk10-docker-0.0.1-SNAPSHOT.jar \
-t registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-1-4-jdk10-docker:0.0.1-SNAPSHOT .
```

## run
```
docker run -p 8080:8080 --rm \
-e JAVA_OPTS='-server -XX:+UseG1GC -XX:MaxGCPauseMillis=50 -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:ActiveProcessorCount=1 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/ -Xlog:age*,gc*=info:file=gc-%p-%t.log:time,tid,tags:filecount=5,filesize=10m -Djava.io.tmpdir=/tmp' \
-e PROFILE='default' \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-1-4-jdk10-docker:0.0.1-SNAPSHOT
```