package com.hlj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


	@RequestMapping("/hello")
		public String hello(){
	    String testword = "���Ե�һ��spring mvc ��Ŀ//n"+"hello world ,spring mvc ������";
	    System.out.println(testword);
	    return "hellojsp";
	}
		
}