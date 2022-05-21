FROM openjdk:8-jre-slim
WORKDIR /opt/service1
COPY target/service1-1.0-SNAPSHOT.jar /opt/service1
ENTRYPOINT ["java", "-jar", "service1-1.0-SNAPSHOT.jar"]
