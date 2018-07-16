package com.kdyzm.spring.helloworld.replacemethod;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TestChangeMethod implements MethodReplacer {
	public void changeMe() {
		System.out.println("change me.");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我替换了原来的方法");
		return null;
	}
}
