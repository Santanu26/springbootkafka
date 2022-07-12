package com.example.springBootkafka.service;

import com.example.springBootkafka.model.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static com.example.springBootkafka.util.Constant.JSON_TOPIC;

@Service
public class JsonProducerService {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonProducerService(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(User user) {
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, JSON_TOPIC).build();

        kafkaTemplate.send(message);
    }
}
