package com.kdyzm.spring.helloworld.beans;

public class MyTestBean {
	private String str = "hello,world!";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "MyTestBean [str=" + str + "]";
	}

}
