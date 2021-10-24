FROM openjdk:11-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application/app.jar
RUN groupadd -g 1000 java_group
RUN useradd -u 1000 -ms /bin/bash -g java_group java_user
USER java_user
EXPOSE 8080
WORKDIR application
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["arg1", "arg2"]