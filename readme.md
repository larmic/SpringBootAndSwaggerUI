# Springboot + swagger + swagger ui example

Simple example to check out why @RequestBody is displayed as string data type (instead of MessageDto).

## Requirements

* Java 1.8
* Maven >= 3.2.1

## Getting started

```
git clone https://github.com/larmic/SpringBootAndSwaggerUI
mvn clean package
mvn spring-boot:run
```

and open ```http://localhost:8080/swagger-ui.html#!/message-resource/sendMessageUsingPOST``

## Problem

Parameter message is displayed as data type string