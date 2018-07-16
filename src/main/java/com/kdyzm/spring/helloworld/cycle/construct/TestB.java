package com.kdyzm.spring.helloworld.cycle.construct;

public class TestB {

	TestB(TestC testC) {
		this.testC = testC;
	}

	private TestC testC;

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public void b() {
		testC.c();
	}
}
