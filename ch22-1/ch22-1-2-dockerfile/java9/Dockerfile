FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/alpine-3.7:glibc-2.27-r0
MAINTAINER caibosi <caibosi@139.com>
ADD openjdk-9u181_linux-x64_bin.tar.gz /opt/
RUN chmod +x /opt/jdk-9
ENV JAVA_HOME=/opt/jdk-9
ENV PATH="$JAVA_HOME/bin:${PATH}"