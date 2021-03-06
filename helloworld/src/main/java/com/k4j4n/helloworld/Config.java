package com.k4j4n.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

import com.k4j4n.helloworld.service.HelloService;
import com.k4j4n.helloworld.service.HelloServiceImpl;

/**
 * Created by k4j4n on 10/30/17.
 */

@Configuration
public class Config {

	@Bean("name")
	public MessageChannel name() {
		return new DirectChannel();
	}

	@Bean("helloGateway")
	@Gateway(requestChannel = "name")
	public HelloService helloService() {
		return new HelloServiceImpl();
	}
}
