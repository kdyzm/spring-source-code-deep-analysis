package com.kdyzm.spring.helloworld.mytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 该类的目的就是将组件注册到容器
 * 
 * @author t_zhengrj
 *
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
