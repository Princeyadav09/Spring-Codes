package com.web.socket.main;


import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainApplication {


	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

//		WebSocketClient webSocketClient = new StandardWebSocketClient();
//		WebSocketStompClient stompClient = new WebSocketStompClient(webSocketClient);
//		stompClient.setMessageConverter(new GsonMessageConverter());
//		stompClient.setTaskScheduler(new ConcurrentTaskScheduler());
//
//		String url = "ws://localhost:8082/connect";
//		StompSessionHandler sessionHandler = new MyStompSessionHandler();
//		stompClient.connect(url, sessionHandler);
//
//		new Scanner(System.in).nextLine();



	}

}
