package com.example.springBootkafka.controller;


import com.example.springBootkafka.model.User;
import com.example.springBootkafka.service.JsonProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonMessageController {

    private final JsonProducerService jsonProducerService;

    public JsonMessageController(JsonProducerService jsonProducerService) {
        this.jsonProducerService = jsonProducerService;
    }

    @GetMapping("api/v1/json/message")
    public ResponseEntity<String> sendMessage(@RequestBody User user) {
        jsonProducerService.send(user);
        return ResponseEntity.ok("Json Message sent to the topic");
    }
}
