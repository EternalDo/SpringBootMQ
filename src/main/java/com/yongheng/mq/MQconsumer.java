package com.yongheng.mq;

import org.springframework.context.annotation.Description;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;
import org.springframework.stereotype.Component;

@Component
public class MQconsumer {
    
	 //监听这个队列
	@JmsListener(destination = "yongheng")
	
	public void readMassage(String text) {

		System.out.println(text + "=======接收到的消息");

	}
}
