#FROM openjdk:17-jdk
#LABEL maintainer="heewon"
#WORKDIR /usr/src/app
#ARG JAR_FILE=./build/libs/auth-service-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} auth-service-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/auth-service-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17

ADD ./build/libs/*SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]