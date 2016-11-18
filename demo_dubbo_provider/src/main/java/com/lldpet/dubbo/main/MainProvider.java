package com.lldpet.dubbo.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
