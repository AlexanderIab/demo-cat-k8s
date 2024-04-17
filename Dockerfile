FROM alpine

RUN apk add openjdk17

COPY build/libs/demo-cat-k8s.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]