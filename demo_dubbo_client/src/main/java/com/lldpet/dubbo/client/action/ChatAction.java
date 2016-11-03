package com.lldpet.dubbo.client.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lldpet.dubbo.service.DemoServer;

public class ChatAction {
	
	public void sayHello(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});
		context.start();
		DemoServer demoServer = (DemoServer)context.getBean("demoService");
		System.out.println("client:"+demoServer.sayHello("XGL-->Morning"+"1:"+df.format(new Date()))+"3:"+df.format(new Date()));
	}
}
