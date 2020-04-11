package com.self.smsc.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SMSCProcessor  implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {

		Message in=exchange.getIn();
		System.out.println("Destination Address:" + in.getHeader("CamelSmppDestAddr"));
		System.out.println("Helllo india");
	}
}
