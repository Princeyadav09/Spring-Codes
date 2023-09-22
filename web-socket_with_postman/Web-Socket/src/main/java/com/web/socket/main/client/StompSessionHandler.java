//package com.web.socket.main.client;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.logging.log4j.LogManager;
//import org.springframework.messaging.simp.stomp.StompCommand;
//import org.springframework.messaging.simp.stomp.StompHeaders;
//import org.springframework.messaging.simp.stomp.StompSession;
//import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Type;
//import java.util.Objects;
//
//@Component
//public class StompSessionHandler extends StompSessionHandlerAdapter {
//
//    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(StompSessionHandler.class);
//
//
//    @Override
//    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//        log.info("Connected : {} , Session : {}",session.getSessionId(),connectedHeaders.getSession());
//    }
//
//    @Override
//    public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
//        log.error("Unexpected Exception occured : Session {} , Command : {}, Header : {} , Payload : {} , Exception : {}",session.getSessionId(),command.getMessageType(),headers,payload,exception.getMessage());
//    }
//
//    @Override
//    public void handleTransportError(StompSession session, Throwable exception) {
//        log.error("Exception in Transport : {} , Exception : {}",session.getSessionId(), exception.getMessage());
//    }
//
//    @Override
//    public void handleFrame(StompHeaders headers, Object payload) {
//        log.info("Frames : Header : {} , Payload : {}", headers,payload);
//    }
//}
