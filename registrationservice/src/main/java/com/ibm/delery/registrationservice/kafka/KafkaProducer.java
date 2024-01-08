package com.ibm.delery.registrationservice.kafka;

import com.ibm.delery.registrationservice.entity.Registration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

// Import necessary classes from the Kafka library
import org.springframework.kafka.core.KafkaTemplate;

// Define a KafkaProducer class
public class KafkaProducer {

    // Private field to hold the KafkaTemplate instance
    private KafkaTemplate<String, String> kafkaTemplate;

    // Constructor to initialize the KafkaTemplate instance
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Method to send a message to a Kafka topic
    public void send(String topic, String employee) {
        // Use the kafkaTemplate to send the provided employee message to the specified topic
        kafkaTemplate.send(topic, employee);
    }
}
