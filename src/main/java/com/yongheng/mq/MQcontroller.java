package com.yongheng.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//消息生产者

@RestController
abstract class MQcontroller {

		@Autowired
		private JmsMessagingTemplate JmsMessagingTemplate;
	
	
	    @RequestMapping("/send")
	public void MQmassageSend(String test){
	    	                              //队列名字
	    	JmsMessagingTemplate.convertAndSend("yongheng",test);
	    	
	    }
	  
}
