package com.k4j4n.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by k4j4n on 11/1/17.
 */

@Service
public class HelloServiceImpl implements HelloService {



	@Override
	public void sayHello(String message) {
		System.out.println(message);
	}
}
