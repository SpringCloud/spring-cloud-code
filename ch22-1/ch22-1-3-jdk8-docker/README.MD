
https://github.com/spotify/dockerfile-maven

```
mvn clean package -Ddockerfile.skip
mvn dockerfile:build 
mvn dockerfile:push -Ddockerfile.username=caibosi@139.com -Ddockerfile.password=

docker run -p 8080:8080 --rm \
-e JAVA_OPTS='-server -Xmx1g -Xms1g -XX:MetaspaceSize=64m -verbose:gc -verbose:sizes -XX:+UseG1GC -XX:MaxGCPauseMillis=50 -XX:+UnlockDiagnosticVMOptions -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/ -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintTenuringDistribution -Xloggc:/opt/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=20M -Djava.io.tmpdir=/tmp' \
-e PROFILE='default' \
registry.cn-hangzhou.aliyuncs.com/springcloud-cn/ch22-1-3-jdk8-docker:0.0.1-SNAPSHOT
```