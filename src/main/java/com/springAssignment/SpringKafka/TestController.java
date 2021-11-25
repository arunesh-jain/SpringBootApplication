package com.springAssignment.SpringKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Producer producerObject;

    @Autowired
    public TestController(Producer producerLocal) {
        producerObject = producerLocal;
    }

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {
        producerObject.sendMessage(message);
    }

}
