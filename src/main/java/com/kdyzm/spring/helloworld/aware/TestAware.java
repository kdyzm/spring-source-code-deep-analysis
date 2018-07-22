package com.kdyzm.spring.helloworld.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class TestAware implements BeanFactoryAware {

	private BeanFactory beanFactory;

	//声明bean的时候spring会自动注入BeanFactory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void testAware(){
		
		Hello bean = (Hello) beanFactory.getBean("hello");
		bean.say();
		
	}

}
