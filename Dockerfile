FROM eclipse-temurin:17

LABEL mentainer="LV"

WORKDIR /app

COPY target/Springboot-Docker-Demo-0.0.1-SNAPSHOT.jar /app/Springboot-Docker-Demo.jar

ENTRYPOINT ["java","-jar","Springboot-Docker-Demo.jar"]