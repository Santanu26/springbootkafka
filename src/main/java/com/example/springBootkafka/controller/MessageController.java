package com.example.springBootkafka.controller;


import com.example.springBootkafka.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final ProducerService kafkaProducer;

    public MessageController(ProducerService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("api/v1/message")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        kafkaProducer.send(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
