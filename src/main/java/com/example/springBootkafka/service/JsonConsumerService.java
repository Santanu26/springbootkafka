package com.example.springBootkafka.service;

import com.example.springBootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.example.springBootkafka.util.Constant.JSON_TOPIC;

@Service
public class JsonConsumerService {
    private static final Logger LOG = LoggerFactory.getLogger(JsonConsumerService.class);
    @KafkaListener(topics = JSON_TOPIC,groupId = "myGroupId")
    public void consume(User message) {
        LOG.info("consume the message: "+ message);
    }
}
