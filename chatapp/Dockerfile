FROM openjdk:8-jre-alpine

WORKDIR /app

COPY build/libs/*.jar /app/chatapp.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/chatapp.jar"]
