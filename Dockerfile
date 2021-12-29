FROM adoptopenjdk/openjdk11:alpine-jre
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz
  && tar xzvf docker-17.04.0-ce.tgz
  && mv docker/docker /usr/local/bin
  && rm -r docker docker-17.04.0-ce.tgz
ARG JAR_FILE=src/main/resources/jar/rest-backend.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]