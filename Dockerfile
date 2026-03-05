# Etapa 1: Construcción con Maven
FROM maven:3.8.4-openjdk-8-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución con JRE ligero
FROM eclipse-temurin:8-jre-jammy
WORKDIR /app
COPY --from=build /app/target/sistema-examenes-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]