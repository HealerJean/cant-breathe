package com.hlj.controller;

import com.hlj.bean.DemoInfo;
import com.hlj.bean.Person;
import com.hlj.repository.PersonRepository;
import com.hlj.service.DemoInfoService;
import com.hlj.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@Autowired
	DemoInfoService demoInfoService;

	@Autowired
	PersonService personService;
    /**
     * 测试添加缓存
 	 * @return
     */
	@RequestMapping("/DemoInfo")
	public @ResponseBody String testDemoInfo(){
	    DemoInfo loadedDemoInfo = demoInfoService.findById(1);
	    System.out.println("loadedDemoInfo="+loadedDemoInfo);
	    DemoInfo cachedDemoInfo = demoInfoService.findById(1);
	    System.out.println("cachedDemoInfo="+cachedDemoInfo);
		loadedDemoInfo = demoInfoService.findById(2);
	    System.out.println("loaded2DemoInfo="+loadedDemoInfo);

		Person person = personService.findById(3);
		System.out.println("loadedPerson="+person);

		return "DemoInfo_ok";


	}
	@RequestMapping("/Person")
	public @ResponseBody String testPerson() {
		//person 开始
		Person person = personService.findById(1);
		System.out.println("loadedPerson="+person);
		Person cachedPerson = personService.findById(1);
		System.out.println("cachedPerson="+cachedPerson);
		person = personService.findById(2);
		System.out.println("loaded2Person="+person);
		return "Person_ok";
	}
    /**
     * 测试删除缓存
	 * @param id
     * @return
     */
	@RequestMapping("/delete")
	public @ResponseBody String delete(long id){
	    demoInfoService.deleteFromCache(id);
	    return "ok";
	} 
	

}
