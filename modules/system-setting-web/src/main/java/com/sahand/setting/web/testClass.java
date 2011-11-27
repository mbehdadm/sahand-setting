package com.sahand.setting.web;

import javax.inject.Named;

@Named("myTest")
public class testClass {
	private String out;
	
	public String getOut()
	{
		return out;
	}
	public void setOut(String out)
	{
		this.out = out;
	}
	
	public testClass() {
		out = "morex result ...";
	}
}
