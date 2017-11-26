FROM openjdk:8
ADD /target/MlabDockerRest-0.0.1-SNAPSHOT.jar  MlabDockerRest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","MlabDockerRest-0.0.1-SNAPSHOT.jar"]

