//package com.web.socket.main.Controller;
//
//import com.web.socket.main.Greeting;
//import com.web.socket.main.HelloMessage;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.util.HtmlUtils;
//
//@Controller
//public class GreetingController {
//
//    @MessageMapping("/request-message")
//    @SendTo("/topic/response-message")
//    public String greet(@Payload String message) throws InterruptedException {
//        return message;
//    }
//
//
//}