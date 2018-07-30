package com.kdyzm.spring.helloworld.myeditor1;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPropertyEditor extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("text=" + text);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date parse = sdf.parse(text);
			this.setValue(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
