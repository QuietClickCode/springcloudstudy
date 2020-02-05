


# 基础镜像
FROM openjdk:8-jdk-alpine
# 对应pom.xml文件中的dockerfile-maven-plugin插件buildArgs配置项JAR_FILE的值

# 复制打包完成后的jar文件到/opt目录下
COPY ./target/service-ribbon-0.0.1-SNAPSHOT.jar /opt/app.jar
EXPOSE 8764
CMD ["java","-jar", "/opt/app.jar"]
# 启动容器时执行
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]
# 使用端口80
#EXPOSE 80