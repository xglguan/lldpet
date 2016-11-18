package com.lldpet.test.account;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lldpet.cms.service.account.user.ITestUserLoginDubboService;

public class TestUser {
	ClassPathXmlApplicationContext context =null;
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("classpath:account-dubbo-consumer.xml");
		context.start(); 
	}
	
	@Test
	public void getUserName(){
		ITestUserLoginDubboService testUserLoginDubboService = 
		(ITestUserLoginDubboService)context.getBean("testUserDubboService");
		
		System.out.println(testUserLoginDubboService.getUserName("xgl"));
	}
}
