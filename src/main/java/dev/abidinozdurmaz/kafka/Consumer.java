package dev.abidinozdurmaz.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = Constants.TOPIC,groupId = Constants.GROUP_ID)
    public void consumeMessage(String message){
        System.out.println("Your message is : "+message);
    }

}
