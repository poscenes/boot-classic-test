FROM openjdk:17-jdk-alpine
MAINTAINER cryMeABeaver
COPY build/libs/test_app.jar test_app.jar
ENTRYPOINT ["java","-jar","/test_app.jar"]