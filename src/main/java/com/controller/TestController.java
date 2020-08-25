package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class TestController {
    @Autowired
    WebSocketHandler webSocketHandler;
    @GetMapping("/test")
    private void sendMessage() throws IOException {
        webSocketHandler.sendMessage("1","abc");
        webSocketHandler.sendMessage("2","zxc");
    }
}
