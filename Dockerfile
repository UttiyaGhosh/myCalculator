FROM openjdk:8
COPY ./target/myCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "myCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
