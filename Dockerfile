FROM openjdk:17
COPY target/first-app.jar first-app.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "/first-app.jar"]