package net.abidinozdurmaz.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private Producer producer;

    @GetMapping
    public void sendMessage(@RequestParam String message){
        producer.sendMessage(message);
    }
}
