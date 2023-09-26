FROM openjdk:21-oracle

COPY ./target/kafka-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch kafka-0.0.1-SNAPSHOT.jar'

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","kafka-0.0.1-SNAPSHOT.jar"]