FROM ubuntu:latest  AS build

RUN apt-get update
RUN spt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

EXPOSE 8080

COPY --from=build target/TodoList-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "app.jar"]