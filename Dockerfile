FROM gradle:7.4.2-jdk11-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src/

WORKDIR /home/gradle/src/
RUN gradle build --no-daemon

FROM openjdk:11-jre-slim

EXPOSE 80

RUN mkdir /app

COPY --from=build /home/gradle/src/application/build/libs/workflow-application-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar

ARG PROFILE
ENV PROFILE_VAR=$PROFILE

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE_VAR}","-jar","/app/spring-boot-application.jar"]