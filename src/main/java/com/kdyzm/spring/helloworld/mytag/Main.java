package com.kdyzm.spring.helloworld.mytag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = (User) context.getBean("testBean");
		System.out.println(user.getUserName() + "," + user.getEmail());
	}
}
