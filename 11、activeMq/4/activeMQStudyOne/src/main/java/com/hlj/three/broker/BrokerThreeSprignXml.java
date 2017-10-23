package com.hlj.three.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BrokerThreeSprignXml {
	public static void main(String[] args)throws Exception {
		

			ApplicationContext context = new ClassPathXmlApplicationContext("broker-applicationContext.xml");

	}
}
