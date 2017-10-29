package com.hlj.five.staticnetworkConnectors;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsStaticReceiver {
    public static void main(String[] args) throws Exception {
    	String linuxIp = "myLinuxQj";
        ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://"+linuxIp+":61616");
        Connection connection =  cf.createConnection();
        connection.start();
        
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("my-queue");
        MessageConsumer consumer = session.createConsumer(destination);
        int i = 0;
        while(i < 10){
            i++;
            TextMessage message = (TextMessage)consumer.receive();
            session.commit();
            System.out.println("接收到的消息是:"+message.getText());
        }
        session.close();
        connection.close();
    }
}