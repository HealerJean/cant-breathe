package com.hlj.activemqOne;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageProducer;
import org.apache.activemq.MessageTransformer;

public class QueueSender {
    public static void main(String[] args) throws Exception {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                "tcp://localhost:61616");
//				"tcp://192.168.1.106:61676");

        Connection connection = connectionFactory.createConnection();
        connection.start();

        Session session = connection.createSession(Boolean.TRUE,
                Session.AUTO_ACKNOWLEDGE);

        Destination destination = session.createQueue("my-queue3");


        ActiveMQMessageProducer producer = (ActiveMQMessageProducer) session.createProducer(destination);

        for (int i = 0; i < 3; i++) {
            TextMessage message = session.createTextMessage("messageAA--" + i);
//			MapMessage message = session.createMapMessage();
//			message.setStringProperty("extra"+i, "okok");
//
//
//			message.setString("message---"+i, "my map message AAA=="+i);

            producer.setTransformer(new MessageTransformer() {

                public Message producerTransform(Session session, MessageProducer producer,
                                                 Message msg) throws JMSException {

                    MapMessage message = session.createMapMessage();
                    message.setString(((TextMessage) msg).getText(), "my map message AAA==" + ((TextMessage) msg).getText());
                    message.setStringProperty("extra", "okok");
                    return message;
                }

                public Message consumerTransform(Session arg0, MessageConsumer arg1,
                                                 Message arg2) throws JMSException {
                    // TODO Auto-generated method stub
                    return null;
                }
            });

            //			Thread.sleep(1000);
            // 通过消息生产者发出消息
            producer.send(message);
        }

        session.commit();
        session.close();
        connection.close();
    }
}
