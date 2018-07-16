package com.kdyzm.spring.helloworld.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Car bean = (Car) context.getBean("car");
		System.out.println(bean);
		
		/**
		 * 加上&符号就能获取CarFactoryBean而非getBean方法返回的对象了
		 */
		CarFactoryBean bean2 = (CarFactoryBean) context.getBean("&car");
		System.out.println(bean2);
	}
}
