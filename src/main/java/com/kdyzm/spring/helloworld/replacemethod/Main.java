package com.kdyzm.spring.helloworld.replacemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		TestChangeMethod method = (TestChangeMethod) bf.getBean("testChangeMethod");
		method.changeMe();
	}
}
