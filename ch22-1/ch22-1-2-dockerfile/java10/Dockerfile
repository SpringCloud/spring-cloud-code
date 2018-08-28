FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/alpine-3.7:glibc-2.27-r0
MAINTAINER caibosi <caibosi@139.com>
ADD openjdk-10.0.1_linux-x64_bin.tar.gz /opt/
RUN chmod +x /opt/jdk-10.0.1
ENV JAVA_HOME=/opt/jdk-10.0.1
ENV PATH="$JAVA_HOME/bin:${PATH}"