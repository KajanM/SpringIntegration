package com.k4j4n.demo.filter;

import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;

/**
 * Created by k4j4n on 11/1/17.
 */

@MessageEndpoint
public class SimpleFilter {

	@Filter(inputChannel = "inputChannel", outputChannel = "toTransformer")
	public boolean process(String message) {
		return "World".equals(message);
	}
}
