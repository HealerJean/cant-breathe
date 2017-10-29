package com.hlj.eigth.message;

import java.io.File;
import java.net.URL;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQSession;
import org.apache.activemq.BlobMessage;

public class BlobMsgSend {
	public static void main(String[] args)throws Exception {
		
		String linuxIp = "myLinuxQj";

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				 ActiveMQConnection.DEFAULT_USER,
		            ActiveMQConnection.DEFAULT_PASSWORD,
				"tcp://"+linuxIp+":61616?jms.blobTransferPolicy.uploadUrl=http://"+linuxIp+":8161/fileserver/"
				);
		
		Connection connection = connectionFactory.createConnection();
		connection.start();

		ActiveMQSession session =(ActiveMQSession) connection.createSession(Boolean.TRUE,
				Session.CLIENT_ACKNOWLEDGE);
		
		Destination destination = session.createQueue("my_queue_blobFile");
		
		
		MessageProducer producer = session.createProducer(destination);
	//	BlobMessage message = session.createBlobMessage(new URL("http://activemq.apache.org/blob-messages.html"));

		BlobMessage message = session.createBlobMessage(new File("pom.xml"));
		
		producer.send(message);
		
		session.commit();
		session.close();
		connection.close();
	}
}
