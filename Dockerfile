FROM openjdk:11
EXPOSE 9092
ADD target/Spring-MVC-0.0.1-SNAPSHOT.jar Spring-MVC-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java", "-jar", "Spring-MVC-0.0.1-SNAPSHOT.jar"]
