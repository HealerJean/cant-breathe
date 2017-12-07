package com.hlj.controller;

import com.hlj.bean.DemoInfo;
import com.hlj.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@Autowired
	DemoInfoService demoInfoService;

 
	@RequestMapping("/DemoInfo")
	public @ResponseBody String testDemoInfo(){
	    DemoInfo loadedDemoInfo = demoInfoService.findById(1);
	    System.out.println("loadedDemoInfo="+loadedDemoInfo);
	    DemoInfo cachedDemoInfo = demoInfoService.findById(1);
	    System.out.println("cachedDemoInfo="+cachedDemoInfo);
		loadedDemoInfo = demoInfoService.findById(2);
	    System.out.println("loaded2DemoInfo="+loadedDemoInfo);


		return "DemoInfo_ok";


	}

    /**
     * 测试删除缓存
	 * @param id
     * @return
     */
	@RequestMapping("/delete")
	public @ResponseBody String delete(long id){
		DemoInfo demoInfo = new DemoInfo();
		demoInfo.setId(id);
	    demoInfoService.deleteFromCache(demoInfo);
	    return "ok";
	}

	
}
