FROM openjdk:latest
COPY ./target/classes/co /tmp/com
WORKDIR /tmp
ENTRYPOINT ["java", "com.napier.sem.App"]