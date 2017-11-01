package com.k4j4n.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

/**
 * Created by k4j4n on 11/1/17.
 */

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean("inputChannel")
	public MessageChannel inputChannel() {return new DirectChannel();}

	@Bean("toTransfomer")
	public MessageChannel toTransformer() {return new DirectChannel();}

	@Bean("toPrint")
	public MessageChannel toPrint() {return new DirectChannel();}
}
