package com.hlj.myws;


import javax.jws.WebService;

/*
 * SEI的实现
 */
@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()"+name);
		System.out.println("修改这里的代码，重新发布");
		return "Hello " +name;
	}

}
