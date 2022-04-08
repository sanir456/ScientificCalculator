FROM openjdk:11
EXPOSE 8083
ADD target/ScientificCalculator-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]
