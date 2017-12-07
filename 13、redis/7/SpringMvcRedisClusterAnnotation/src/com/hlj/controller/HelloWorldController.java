package com.hlj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


	@RequestMapping("/hello")
		public String hello(){
	    String testword = "测试第一个spring mvc 项目//n"+"hello world ,spring mvc 我来了";
	    System.out.println(testword);
	    return "hellojsp";
	}
		
}