package com.hlj.three.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BrokerTwo {
	public static void main(String[] args)throws Exception {
		

		String Uri = "properties:broker.properties"; 
		BrokerService broker1 = BrokerFactory.createBroker(new URI(Uri)); 
		broker1.addConnector("tcp://localhost:61616"); 
		broker1.start();
				
	}
}
