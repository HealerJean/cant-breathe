package com.hlj.main;

import com.hlj.client.HelloWSImpl;
import com.hlj.client.HelloWSImplService;



public class TestWebService {
	
	public static void main(String[] args) {
		HelloWSImpl hello = new HelloWSImplService().getHelloWSImplPort();    
	    
		String name = hello.sayHello("zhang yu jin ");
	    System.out.println(name);
	}


}