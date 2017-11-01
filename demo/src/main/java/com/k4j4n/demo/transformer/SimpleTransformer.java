package com.k4j4n.demo.transformer;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

/**
 * Created by k4j4n on 11/1/17.
 */

@MessageEndpoint
public class SimpleTransformer {

	@Transformer(inputChannel = "toTransformer", outputChannel = "toPrint")
	public String proces(String message) {
		return "Hello ".concat(message);
	}
}
