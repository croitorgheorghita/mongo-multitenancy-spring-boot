# springboot-multi-tenancy-with-mongo

[Spring Boot](http://projects.spring.io/spring-boot/) sample app to implement Dynamic Multi-tenancy with MongoDb.\
This repository contains the code for the [How to implement Dynamic Multi-tenancy with MongoDb and Spring Boot](https://assist-software.net/blog/how-implement-dynamic-multi-tenancy-mongodb-and-spring-boot) article.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Gradle 6+](https://gradle.org/)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine.

* execute the `main` method in the `com.assist.java.multitenancy.MultiTenancyApplication` class from your IDE.

* use the [Spring Boot Gradle plugin](https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/) like so:

```shell
gradlew bootrun
```