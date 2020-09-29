FROM openjdk:8-jre-slim
WORKDIR /home
COPY /target/denemeDemo-0.0.1-SNAPSHOT.jar denemeDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "denemeDemo-0.0.1-SNAPSHOT.jar"]