package com.kdyzm.spring.helloworld.cycle.setter;

public class TestC {

	private TestA testA;

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public void c() {
		testA.a();
	}
}
