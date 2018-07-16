package com.kdyzm.spring.helloworld.cycle.construct;

public class TestC {
	TestC(TestA testA) {
		this.testA = testA;
	}

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
