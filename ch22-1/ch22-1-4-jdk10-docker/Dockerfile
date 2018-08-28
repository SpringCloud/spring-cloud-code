FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/java:openjdk-10.0.1-alpine as packager

## jlink
RUN /opt/jdk-10.0.1/bin/jlink \
    --module-path /opt/jdk-10.0.1/jmods \
    --verbose \
    --add-modules java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.desktop,java.management,java.naming,java.instrument,jdk.jstatd,jdk.jcmd,jdk.management \
    --compress 2 \
    --no-header-files \
    --output /opt/jdk-10-jlinked

# copy jdk after jlink
FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/alpine-3.7:glibc-2.27-r0
COPY --from=packager /opt/jdk-10-jlinked /opt/jdk-10.0.1
ENV JAVA_HOME=/opt/jdk-10.0.1
ENV PATH=$JAVA_HOME/bin:$PATH

## add jar
ARG JAR_FILE
ENV PROFILE default
ADD target/${JAR_FILE} /opt/app.jar
EXPOSE 8080
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -Duser.timezone=Asia/Shanghai -Dfile.encoding=UTF-8 -Dspring.profiles.active=${PROFILE} -jar /opt/app.jar