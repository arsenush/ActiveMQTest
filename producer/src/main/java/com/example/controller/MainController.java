package com.example.controller;

import com.example.service.messaging.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private MessageSender messageSender;

    @Autowired
    public MainController(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/send")
    public String send(String text, Model model) {
        messageSender.send(text);
        model.addAttribute("response", "OK");
        return "index";
    }
}
