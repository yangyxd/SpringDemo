package com.yxd.example.bean;

import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloBean implements Hello {

	@Override
	public void sayEasy() {
		System.out.println("HelloBean Easy.");
	}

	@Override
	public void sayByeBye() {
		System.out.println("HelloBean Bye Bye.");
	}

}
