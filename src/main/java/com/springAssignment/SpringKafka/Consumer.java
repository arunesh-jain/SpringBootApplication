package com.springAssignment.SpringKafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "test-topic" , groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
