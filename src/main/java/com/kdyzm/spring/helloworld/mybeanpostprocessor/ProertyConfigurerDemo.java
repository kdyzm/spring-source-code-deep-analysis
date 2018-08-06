package com.kdyzm.spring.helloworld.mybeanpostprocessor;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ProertyConfigurerDemo {
	public static void main(String[] args) {
		ConfigurableListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/kdyzm/spring/helloworld/mybeanpostprocessor/application.xml"));
		BeanFactoryPostProcessor bfpp=(BeanFactoryPostProcessor) bf.getBean("bfpp");
		bfpp.postProcessBeanFactory(bf);
		System.out.println(bf.getBean("simpleBean"));
	}

}
