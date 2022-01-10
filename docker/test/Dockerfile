#FROM gradle:4.3-jdk-alpine
#WORKDIR /tests
#COPY . .
#CMD gradle -version

FROM ubuntu:16.04
RUN apt-get update
RUN apt-get update && apt-get install -y \
  default-jre \
  default-jdk \
  git \
  gradle

RUN gradle -version
RUN git clone https://github.com/PavelSemenovNickolaevich/rest-backend-api-testing.git
CMD ls
CMD ls
CMD gradle clean task tickets