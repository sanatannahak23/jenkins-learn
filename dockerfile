FROM openjdk:17-slim

WORKDIR /app

COPY out/artifacts/learn_jenkins_jar/learn-jenkins.jar /app/app.jar

CMD ["java","-jar","app.jar"]

EXPOSE 8080