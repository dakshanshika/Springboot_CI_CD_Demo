FROM ubuntu:latest
LABEL authors="LENOVO"

EXPOSE 8080
ADD target/cicd_demo.jar cicd_demo.jar
ENTRYPOINT ["java","-jar","/cicd_demo.jar"]