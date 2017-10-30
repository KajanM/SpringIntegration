package com.k4j4n.helloworld.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Created by k4j4n on 10/30/17.
 */

@Service("helloService")
public class HelloServiceImpl implements HelloService {
	@Override
	@ServiceActivator(inputChannel = "name")
	public void sayHello(String name) {
		System.out.println("Hello " + name + " :)");
	}
}
