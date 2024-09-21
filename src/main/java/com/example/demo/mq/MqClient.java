package com.example.demo.mq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * @author F190010
 * @date 2023/1/17
 */
public class MqClient {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connect = factory.newConnection();
        Channel channel = connect.createChannel();
        String queueName = "queue1";
        channel.basicConsume(queueName, false, new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String routingkey = envelope.getRoutingKey();
                System.out.println(routingkey);
                this.getChannel().basicAck(envelope.getDeliveryTag(), false);
            }
        });
    }
}
