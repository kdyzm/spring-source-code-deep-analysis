package com.kdyzm.spring.helloworld.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kdyzm/spring/helloworld/aware/application.xml");
		TestAware testAware = (TestAware) context.getBean("testAware");
		testAware.testAware();
	}
}
