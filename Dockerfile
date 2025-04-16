# ---- Base JRE Stage ----
FROM eclipse-temurin:21-jre-alpine as base
WORKDIR /app
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# ---- Build Stage ----
FROM eclipse-temurin:21-jdk-alpine as builder
WORKDIR /build

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY core core
COPY infrastructure infrastructure
COPY application application

# Download dependencies
RUN ./mvnw install -DskipTests

# Package the full multi-module app
RUN ./mvnw package -DskipTests

# ---- Runtime Stage ----
FROM base
WORKDIR /app

# Copy the final JAR from the application module
COPY --from=builder /build/application/target/hexagonal-template.jar app.jar

USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
