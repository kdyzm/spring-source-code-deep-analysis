package com.kdyzm.spring.helloworld.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		GetBeanTest bean = (GetBeanTest) bf.getBean("getBeanTest");
		bean.showMe();
	}
}
