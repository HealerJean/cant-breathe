package com.hlj.myws;


import javax.jws.WebService;

/*
 * SEI��ʵ��
 */
@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()"+name);
		System.out.println("�޸�����Ĵ��룬���·���");
		return "Hello " +name;
	}

}
