FROM ubuntu:latest
ENV TZ=Europe/Moscow
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apt-get update && apt-get install -y \
 default-jre \
 default-jdk \
 unzip\
 curl\
 git

WORKDIR /gradle
RUN curl -L https://services.gradle.org/distributions/gradle-7.3.3-bin.zip -o gradle-7.3.3-bin.zip
RUN unzip gradle-7.3.3-bin.zip
ENV GRADLE_HOME=/gradle/gradle-7.3.3
ENV PATH=$PATH:$GRADLE_HOME/bin

RUN git clone https://github.com/PavelSemenovNickolaevich/rest-backend-api-testing.git
RUN cd rest-backend-api-testing
CMD pwd

CMD ls -la
CMD cd rest-backend-api-testing && gradle tickets