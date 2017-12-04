package com.hlj.controller;
import javax.annotation.Resource;

import com.hlj.bean.DemoInfo;
import com.hlj.service.DemoInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author HealerJean
 * @Date 2017/11/30  15:44.
 */


import javassist.NotFoundException;

@RestController
public class DemoInfoController {

    @Resource
    private DemoInfoService demoInfoService;

    @RequestMapping("/save")
    public String test(){

        //存入数据.
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setId(18);
        demoInfo.setName("张三");
        demoInfo.setPwd("123456");
        DemoInfo demoInfo2 = demoInfoService.save(demoInfo);

        //不走缓存.
        System.out.println(demoInfoService.findById(demoInfo2.getId()));
        //走缓存.
        System.out.println(demoInfoService.findById(demoInfo2.getId()));

        return "ok";
    }

    @RequestMapping("/update")
    public String update(long id ){

        System.out.println("============修改数据=====================");
        //修改数据.
        DemoInfo updated = new DemoInfo();
        updated.setName("李四-updated");
        updated.setPwd("123456");
        updated.setId(id);
        try {
            System.out.println(demoInfoService.update(updated));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        //不走缓存.
        System.out.println(demoInfoService.findById(updated.getId()));
        return "ok";
    }

    @RequestMapping("/delete")
    public String delete(long id ){
        demoInfoService.delete(id);
        return "ok";
    }

    @RequestMapping("/findById")
    public String findById(long id ){
        System.out.println(demoInfoService.findById(id));

        return "ok";
    }

}