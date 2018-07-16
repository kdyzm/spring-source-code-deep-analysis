package com.kdyzm.spring.helloworld.cycle.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kdyzm/spring/helloworld/cycle/setter/application.xml");
		System.out.println(context.getBean("testA"));
	}
}
