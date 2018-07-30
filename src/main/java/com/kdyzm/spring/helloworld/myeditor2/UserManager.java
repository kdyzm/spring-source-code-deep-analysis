package com.kdyzm.spring.helloworld.myeditor2;

import java.util.Date;

public class UserManager {

	//Date类型的变量无法使用DI进行依赖注入，普通属性则是可以的
	private Date dateValue;

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

}
