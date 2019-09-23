FROM openjdk:8-jdk-alpine

LABEL maintainer="Jonathan Mendoza"

EXPOSE 8071

ARG JAR_FILE=api-customer-2.0-SNAPSHOT.jar
ADD ${JAR_FILE} api-customer.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-customer.jar"]