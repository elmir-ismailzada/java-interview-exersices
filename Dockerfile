# === Build stage ===
FROM eclipse-temurin:21-jdk AS build
WORKDIR /workspace

COPY build.gradle.kts settings.gradle.kts ./
COPY gradle gradle
COPY gradlew .

RUN chmod +x gradlew || true

# Copy source
COPY src src

RUN ./gradlew --no-daemon clean bootJar -x test

# === Runtime stage ===
FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /workspace/build/libs/*.jar /app/app.jar

EXPOSE 8080

USER 1001

ENTRYPOINT ["java","-jar","/app/app.jar"]


