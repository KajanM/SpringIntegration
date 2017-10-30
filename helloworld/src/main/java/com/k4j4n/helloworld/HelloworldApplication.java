package com.k4j4n.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(HelloworldApplication.class, args);
		MessageChannel channel = ctx.getBean("name", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("Kajan").build();

		channel.send(message);
	}
}
