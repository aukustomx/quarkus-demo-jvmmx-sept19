# Phone Contacts RESTful API using Quarkus

## Bootstraping an application using maven.
```bash
mvn io.quarkus:quarkus-maven-plugin:0.22.0:create \
-DprojectGroupId=com.jvmmx.quarkus \
-DprojectArtifactId=borrar \
-Dpath="/hello" \
-DclassName="com.jvmmx.quarkus.HelloResource"
```
## Review the maven structure generated
```bash
> tree
├── pom.xml
└── src
    ├── main
    │   ├── docker
    │   │   ├── Dockerfile.jvm
    │   │   └── Dockerfile.native
    │   ├── java
    │   │   └── com
    │   │       └── jvmmx
    │   │           └── quarkus
    │   │               └── HelloResource.java
    │   └── resources
    │       ├── application.properties
    │       └── META-INF
    │           └── resources
    │               └── index.html
    └── test
        └── java
            └── com
                └── jvmmx
                    └── quarkus
                        ├── HelloResourceTest.java
                        └── NativeHelloResourceIT.java
```

## Review the pom.xml; bom and extensions

## Review the JAX-RS resource generated

## Run the application
```bash
mvn compile quarkus:dev
```

## Request the provided endpoint (/hello)
```bash
curl -w "\n" http://localhost:8080/hello
```

## Review and run provided test
```bash
mvn clean test
```

## Create a contact package
```java
com.jvmmx.contact
```

## Create Contact, ContactResource and ContactService classes
```java
tree src/main/java/com/jvmmx/contact/
├── Contact.java
├── ContactResource.java
└── ContactService.java
```

## Review extensions
```bash
mvn quarkus:list-extensions
```

## Install resteasy-jsonb extension
```bash
mvn quarkus:add-extension -Dextensions="quarkus-resteasy-jsonb,quarkus-hibernate-orm-panache,quarkus-jdbc-postgresql"
```

## Review the recently installed extensions in the pom.xml

## Annotate classes with JAX-RS, JPA and CDI annotations

# Add database configuration to the application.properties
```java
quarkus.datasource.driver=org.postgresql.Driver
quarkus.datasource.url=${POSTGRES_URL}
quarkus.datasource.username=${POSTGRES_USER}
quarkus.datasource.password=${POSTGRES_PASS}

quarkus.hibernate-orm.database.generation=update
quarkus.hibernate-orm.log.sql=true
```

## Overview Hibernate panache page
https://quarkus.io/guides/hibernate-orm-panache-guide

## Implement all resource operations: all, byId, add, update, delete

## Implement all service operations

## Run the application
```bash
mvn compile quarkus:dev
```

## Add open-api extension
```bash
mvn quarkus:add-extension -Dextensions="quarkus-smallrye-openapi"
```

## Request api with HTTP operations via swagger-ui
http://localhost:8080/swagger-ui

