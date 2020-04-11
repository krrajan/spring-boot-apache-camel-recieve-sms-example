package com.self.smsc.route;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.self.smsc.processors.SMSCProcessor;

@Component
public class CamelRoute extends SpringRouteBuilder {

	@Autowired
	private SMSCProcessor processor;

	@Override
	public void configure() throws Exception {
		//from("jetty:http://localhost:4444/Hello").process(processor);
		
		from("smpp://smppclient1@127.0.0.1:2775?password=password").process(processor);
	}

}
