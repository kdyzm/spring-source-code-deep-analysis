package com.kdyzm.spring.helloworld.mycontext;

import org.springframework.context.ApplicationContext;

import com.kdyzm.spring.helloworld.beans.MyTestBean;

/**
 * Hello world!
 * 
 */
public class MyContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new MyContext("application.xml");
		MyTestBean bean = (MyTestBean) context.getBean("myTestBean");
		System.out.println(bean);
	}
}
