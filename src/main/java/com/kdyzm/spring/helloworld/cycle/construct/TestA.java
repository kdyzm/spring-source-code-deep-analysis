package com.kdyzm.spring.helloworld.cycle.construct;

public class TestA {

	TestA(TestB testB) {
		this.testB = testB;
	}

	private TestB testB;

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public void a() {
		testB.b();
	}
}
