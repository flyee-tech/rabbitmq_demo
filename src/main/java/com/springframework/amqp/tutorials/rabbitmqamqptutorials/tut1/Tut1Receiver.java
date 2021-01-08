package com.springframework.amqp.tutorials.rabbitmqamqptutorials.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author peierlong
 * @version V1.0
 * @date 2021/1/8
 */
@RabbitListener(queues = "hello")
public class Tut1Receiver {

    @RabbitHandler
    public void receiver(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }

}
