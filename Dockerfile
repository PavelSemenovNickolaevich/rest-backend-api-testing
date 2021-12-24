FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/src/main/resources/jar/rest-backend.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]