FROM openjdk:11
COPY ./target/spe-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","spe-1.0-SNAPSHOT-jar-with-dependencies.jar"]