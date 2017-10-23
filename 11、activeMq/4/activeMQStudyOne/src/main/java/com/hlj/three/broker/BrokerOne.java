package com.hlj.three.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BrokerOne {
	public static void main(String[] args)throws Exception {
		
		BrokerService broker = new BrokerService(); 
		
		broker.setUseJmx(true); 
		
		broker.addConnector("tcp://localhost:66666"); 
		
		broker.start();

				
	}
}
