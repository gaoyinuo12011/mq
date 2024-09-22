package com.example.demo.mq;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author F190010
 * @date 2023/1/17
 */
public class MqService {
   /* public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connect = factory.newConnection();
        String exchangeName= "testExchange";
        String routingkey = "routingkey";
        Channel channel = connect.createChannel();
        channel.exchangeDeclare(exchangeName, "direct", true);
        String queueName = "queue1";
        channel.queueDeclare(queueName, false, false, true, null);
        channel.queueBind(queueName, exchangeName, routingkey);
        channel.basicPublish(exchangeName, routingkey, null, "haohaode".getBytes());

    }*/
}
