package com.example.springBootkafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.example.springBootkafka.util.Constant.GROUP_ID;
import static com.example.springBootkafka.util.Constant.STRING_TOPIC;

@Service
public class ConsumerService {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = STRING_TOPIC, groupId = GROUP_ID)
    public void consume(String message) {
        LOG.info("consume the message: " + message);
    }
}
