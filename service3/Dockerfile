FROM openjdk:8-jre-slim
WORKDIR /opt/service3
COPY target/service3-1.0-SNAPSHOT.jar /opt/service3
ENTRYPOINT ["java", "-jar", "service3-1.0-SNAPSHOT.jar"]
