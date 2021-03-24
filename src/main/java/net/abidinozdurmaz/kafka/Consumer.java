package net.abidinozdurmaz.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = Constants.topic,groupId = Constants.groupId)
    public void consumeMessage(String message){
        System.out.println("Gönderdiğiniz mesaj : "+message);
    }

}
