package com.chatapp.chatroomapp.messagecontroller;


import com.chatapp.chatroomapp.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {
        return message;

    }

    @GetMapping("/health")
    public String getHealth(){
        return "ok";
    }
}
