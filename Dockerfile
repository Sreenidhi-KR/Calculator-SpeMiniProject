FROM openjdk:17
COPY ./target/SpeMiniProject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java" , "cp","SpeMiniProject-1.0-SNAPSHOT.jar" , "Calculator"]