FROM eclipse-temurin:21-jdk-jammy
ARG JAR_FILE=target/4-springboot-ejercicio2-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]