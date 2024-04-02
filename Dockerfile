FROM maven:3.9.6 AS build
WORKDIR /app
COPY src src
COPY pom.xml .
RUN mvn clean package -Dmaven.test.skip

FROM openjdk:21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD java -jar app.jar
