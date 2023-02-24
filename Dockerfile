FROM maven:3.9.0-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY backend/pom.xml /app/spring
COPY backend/src /app/spring/src
RUN mvn -f pom.xml clean install -DskipTests=true

FROM openjdk:20-ea-17-oracle
COPY --from=build /backend/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

# Declare the base image
FROM node:19-alpine
WORKDIR /app

# Build step
COPY frontend/package*.json /app/react/

# Install dependencies
RUN yarn install

# Copy the source code to WORKDIR dir
COPY ./frontend ./react

# Expose port on the container
EXPOSE 3000

# run the app
CMD ["yarn", "dev"]