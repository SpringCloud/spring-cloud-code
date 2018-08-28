FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/alpine-3.7:glibc-2.27-r0
MAINTAINER caibosi <caibosi@139.com>
ADD server-jre-8u172-linux-x64.tar.gz /opt/
RUN chmod +x /opt/jdk1.8.0_172
ENV JAVA_HOME=/opt/jdk1.8.0_172
ENV PATH="$JAVA_HOME/bin:${PATH}"