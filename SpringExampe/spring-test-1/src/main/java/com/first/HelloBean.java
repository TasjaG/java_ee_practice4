package com.first;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	private String name;
	 
	public void setName(String name) {
	this.name = name;
	}
	 
	public void printHello() {
	System.out.println("Spring 3 : Hello ! " + name);
	}

}
