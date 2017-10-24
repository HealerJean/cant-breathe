package com.hlj.six.destination;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueReceiverDestination1 {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		
		for(int i=0;i<30;i++){
			Thread t = new MyThread(cf);
			t.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
			//	e1.printStackTrace();
			}
		}
	}

}

class MyThread extends Thread{
	private ConnectionFactory cf = null;
	public MyThread(ConnectionFactory cf){
		this.cf = cf;
	}
	public void run(){
		try{
			final Connection connection = cf.createConnection();
			connection.start();
	
			final Session session = connection.createSession(Boolean.TRUE,
					Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("my-queue");//"my-queue");
	
			MessageConsumer consumer = session.createConsumer(destination);
			consumer.setMessageListener(new MessageListener() {
				
				public void onMessage(Message msg) {
						try {
							TextMessage txtMsg = (TextMessage)msg;
							System.out.println("Receiver11111===="+txtMsg.getText());

							session.commit();
						} catch (JMSException e) {
						//	e.printStackTrace();
						}
					try {
						session.commit();
					} catch (JMSException e) {
						//e.printStackTrace();
					}
					try {
						session.close();
					} catch (JMSException e) {
						//e.printStackTrace();
					}
					try {
						connection.close();
					} catch (JMSException e) {
						//e.printStackTrace();
					}
				}
			});
			
			
			
		}catch(Exception err){
			err.printStackTrace();
		}
	}
}