package com.kdyzm.spring.helloworld.cycle.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kdyzm/spring/helloworld/cycle/construct/application.xml");
	}
}
