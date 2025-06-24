package com.example.chatapp.Controller;

import com.example.chatapp.Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public ChatMessage sendMessage(ChatMessage chatMessage) throws Exception {
        return chatMessage;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
