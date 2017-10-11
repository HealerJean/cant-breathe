package com.hlj.springTestSuccess;


public class TestService {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public void testSpringBean(){
		System.out.println("bye"+name);
	}
}
