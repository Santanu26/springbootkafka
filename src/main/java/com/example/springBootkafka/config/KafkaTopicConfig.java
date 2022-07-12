package com.example.springBootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.example.springBootkafka.util.Constant.JSON_TOPIC;
import static com.example.springBootkafka.util.Constant.STRING_TOPIC;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(STRING_TOPIC)
                //.partitions(10)
                .build();
    }

    @Bean
    public NewTopic newTopicAsJson() {
        return TopicBuilder.name(JSON_TOPIC)
                //.partitions(10)
                .build();
    }
}
