FROM openjdk:8-jre-slim
WORKDIR /opt/service2
COPY target/service2-1.0-SNAPSHOT.jar /opt/service2
ENTRYPOINT ["java", "-jar", "service2-1.0-SNAPSHOT.jar"]
