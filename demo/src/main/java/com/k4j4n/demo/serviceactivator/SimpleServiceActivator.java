package com.k4j4n.demo.serviceactivator;

import sun.plugin2.message.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.k4j4n.demo.service.HelloService;

/**
 * Created by k4j4n on 11/1/17.
 */

@MessageEndpoint
public class SimpleServiceActivator {

	@Autowired
	HelloService helloService;

	@ServiceActivator(inputChannel = "toPrint")
	public void process(String message) {
		helloService.sayHello(message);
	}
}
