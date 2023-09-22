//package com.web.socket.main.Controller;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.stereotype.Controller;
//
//import java.util.Map;
//
//@Controller
//public class MyController {
//
//    @MessageMapping("/action")
//    public void handle(SimpMessageHeaderAccessor headerAccessor) {
//        Map<String, Object> attrs = headerAccessor.getSessionAttributes();
//
//        @Component
//        @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
//        public class MyBean {
//
//            @PostConstruct
//            public void init() {
//                // Invoked after dependencies injected
//            }
//
//            // ...
//
//            @PreDestroy
//            public void destroy() {
//                // Invoked when the WebSocket session ends
//            }
//        }
//
//        @Controller
//        public class MyController {
//
//            private final MyBean myBean;
//
//            @Autowired
//            public MyController(MyBean myBean) {
//                this.myBean = myBean;
//            }
//
//            @MessageMapping("/action")
//            public void handle() {
//                // this.myBean from the current WebSocket session
//            }
//        }
//    }
//}