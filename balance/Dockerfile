FROM amazoncorretto:17-alpine-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/balance-0.0.1.jar .
EXPOSE 3003
ENTRYPOINT ["java", "-jar", "balance-0.0.1.jar"]