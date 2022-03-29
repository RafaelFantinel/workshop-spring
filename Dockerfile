# Stage 1: Build with maven
FROM maven:3.8.1-openjdk-17 AS example-s1
COPY . .
RUN mvn -T 4C clean install -U

# Stage 2: Run application
FROM bellsoft/liberica-openjdk-alpine:17 AS example-s2
COPY --from=example-s1 target/*.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egad=file:/dev/./urandom -jar /app.jar