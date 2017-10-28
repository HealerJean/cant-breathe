package com.hlj.five.staticnetworkConnectors;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsStaticSend {
    public static void main(String[] args) throws Exception {
    	
        System.out.println("networkConnection success send");

    	String linuxIp = "myLinuxQj";
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://"+linuxIp+":61617");
        Connection connection = connectionFactory.createConnection();
        connection.start();
        
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("my-queue");
        
        MessageProducer producer = session.createProducer(destination);
        for(int i = 0;i < 10;i++){
            TextMessage message = session.createTextMessage("message,1212 --->" + i);
            Thread.sleep(1000);
            //通过生产者发出消息
            producer.send(message);
        }
        System.out.println("networkConnection success send");
        session.commit();
        session.close();
        connection.close();
    }
}