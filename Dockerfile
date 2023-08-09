FROM openjdk:17.0.1-jdk-slim

COPY //domain//target//domain-1.0-SNAPSHOT.jar //app//domain-1.0-SNAPSHOT.jar
COPY //adapter//target//adapter-1.0-SNAPSHOT.jar //app//adapter-1.0-SNAPSHOT.jar
COPY //application//target//application-1.0-SNAPSHOT.jar //app//application-1.0-SNAPSHOT.jar

CMD ["java", "-jar", "app/application-1.0-SNAPSHOT.jar"]