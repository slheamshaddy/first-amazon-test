FROM openjdk:11-jdk-slim
ADD target/first-test.jar first-test.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","first-test.jar"]