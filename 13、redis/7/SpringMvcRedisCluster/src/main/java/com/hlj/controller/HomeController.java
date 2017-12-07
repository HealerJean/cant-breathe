package com.hlj.controller;

import com.hlj.bean.pojo.TbUser;
import com.hlj.service.DemoInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@Autowired
	DemoInfoService demoInfoService;

	@ResponseBody
	@RequestMapping("/hello")
		public String hello(){
	    String testword = "测试第一个spring mvc 项目//n"+"hello world ,spring mvc 我来了";
	    System.out.println(testword);
	    return "hellojsp";
	}
	
	@RequestMapping("/DemoInfo")
	public @ResponseBody String testDemoInfo(){
	    TbUser loadedTbUser = demoInfoService.findById(1);
	    System.out.println("loadedDemoInfo="+loadedTbUser);
	    TbUser cachedTbUser= demoInfoService.findById(1);
	    System.out.println("cachedDemoInfo="+cachedTbUser);
		loadedTbUser = demoInfoService.findById(2);
	    System.out.println("loaded2DemoInfo="+loadedTbUser);

		return "DemoInfo_ok";


	}

  
	@RequestMapping("/delete")
	public @ResponseBody String delete(long id){
		TbUser tbUser = new TbUser();
		tbUser.setId(id);
	    demoInfoService.deleteFromCache(tbUser);
	    return "ok";
	}

	
}
