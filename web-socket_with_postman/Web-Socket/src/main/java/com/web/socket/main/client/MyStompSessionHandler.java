//package com.web.socket.main.client;
//
//import com.web.socket.main.Greeting;
//import org.springframework.messaging.simp.stomp.*;
//
//import java.lang.reflect.Type;
//
//public class MyStompSessionHandler extends StompSessionHandlerAdapter {
//
//    @Override
//    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//
//        session.subscribe("/topic/greetings", this);
//        session.send("/app/response-message", "{\"name\":\"Client\"}".getBytes());
//
//    }
//
//    @Override
//    public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
//        exception.printStackTrace();
//    }
//
//    @Override
//    public Type getPayloadType(StompHeaders headers) {
//        return Greeting.class;
//    }
//
//    @Override
//    public void handleFrame(StompHeaders headers, Object payload) {
////        log.info("Received: {}", ((Greeting) payload).getContent());
//    }
//}