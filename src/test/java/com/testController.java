package com;

import com.controller.WebSocketHandler;
import org.junit.Test;


public class testController {

    @Test
    public void testSendMessage() throws Exception{
        WebSocketHandler webSocketHandler = new WebSocketHandler();
        webSocketHandler.sendMessage("1","abc");
    }
}
