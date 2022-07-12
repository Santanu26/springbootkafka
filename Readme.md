# Spring Boot Kafka Example

## Basic configuration with sending message from producer to consumer example

This sample application shows how to use basic Spring Boot configuration to set up a producer to a topic with multiple partitions and a consumer group with three different consumers.


## Multiple serialization / deserialization formats

To illustrate the different configuration options, this application deserializes Kafka messages in three different ways:

* As a simple String (plain JSON).
* As a JSON to Java object.
* As a byte array(I'll add those)

## REST Endpoint 
* GET: http:localhost:8080/api/v1/message?message=Hello from kafka producer
* GET: http:localhost:8080/api/v1/json/message
* Request Body:
{"id": "1", "firstName": "shantanu", "lastName": "Barua" }


## Was it useful?

Give a star to this project, and consider some extra readings:

* [Apache Kafka Quickstart](https://kafka.apache.org/quickstart).
* [Apache Kafka from Conduktor](https://www.conduktor.io/kafka/what-is-apache-kafka).
* [And the Spring-Kafka Documentation PDF](https://docs.spring.io/spring-kafka/docs/2.8.7/reference/pdf/spring-kafka-reference.pdf).