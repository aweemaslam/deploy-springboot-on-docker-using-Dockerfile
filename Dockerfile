FROM openjdk:19-jdk-alpine3.16
VOLUME /tmp
ADD target/dockerexample-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]