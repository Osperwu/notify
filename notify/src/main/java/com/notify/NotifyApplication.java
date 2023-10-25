package com.notify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


@EnableWebSocket // 开启websocket
@SpringBootApplication
public class NotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifyApplication.class, args);
	}

}
