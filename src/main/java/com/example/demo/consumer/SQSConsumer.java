package com.example.demo.consumer;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SQSConsumer {

    @SqsListener(value = "fila-api-java", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receive(String message) {
        System.out.println(message);
    }

}
