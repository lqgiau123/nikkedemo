package com.bezkoder.spring.thymeleaf.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatBotRequest {
     private String model;
    private List<Message> messages;
    private int n;
    private double temperature;
    private int max_tokens;
    private String stop;

    public ChatBotRequest(String model, String prompt) {
        this.model = model;
        
        this.messages = new ArrayList<>();
        this.messages.add(new Message("assistant", prompt));
    }
}
