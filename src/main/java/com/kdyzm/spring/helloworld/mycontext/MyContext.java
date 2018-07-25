package com.kdyzm.spring.helloworld.mycontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyContext extends ClassPathXmlApplicationContext {

	public MyContext(String... locations) {
		super(locations);
	}

	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("Zhengrj");
	}
}
