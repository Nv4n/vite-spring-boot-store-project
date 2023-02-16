FROM maven:3.9.0-eclipse-temurin-17-alpine AS build
RUN mkdir -p workspace
WORKDIR workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -f pom.xml clean install -DskipTests=true

FROM openjdk:20-ea-17-oracle
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]