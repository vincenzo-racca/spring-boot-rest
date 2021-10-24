### REST Web Service + CRUD in 5 minutes with Spring Boot and Spring Data REST

This simple project show you the power of Spring Data Rest: you can build APIs REST without writing the Controllers. \
Spring will create for you all the REST APIs from the Repositories.

Read my article about that:

My article about this project (English language): https://www.vincenzoracca.com/en/blog/framework/spring/spring-boot/ \
My article about this project (Italian language): https://www.vincenzoracca.com/blog/framework/spring/spring-boot/

#### Exec with Docker
Recently I added a Dockerfile to exec this simple app as a docker container

1. Go to root dir (spring-boot-rest)
2. run `docker build -t spring-boot-rest .` command to build the docker image
3. run `docker run --name=spring-boot -d spring-boot-rest` to create a container called spring-boot-rest from that image