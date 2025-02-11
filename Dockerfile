FROM eclipse-temurin:21-jre

COPY target/simple-crud-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]