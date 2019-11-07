FROM openjdk:8-jdk-alpine
MAINTAINER 'heavyflood' 'heavyflood@sicc.co.kr'
VOLUME /demo
ARG SERVER_ENV=prod
ENV SERVER_ENV ${SERVER_ENV}
ENV JAVA_OPTS="-XX:PermSize=1024m -XX:MaxPermSize=512m -Xmx4g -Xms2g"
COPY build/libs/demo-0.0.1.jar .
ENTRYPOINT ["java", "-Dspring.profiles.active=${SERVER_ENV}", "-jar","/demo-0.0.1.jar"]