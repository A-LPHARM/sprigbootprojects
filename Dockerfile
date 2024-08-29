FROM openjdk:8-jre-alpine

COPY chatapp-1.0.jar /app/chatapp.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/test_service.jar"]
