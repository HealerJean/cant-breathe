package com.hlj.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hlj.service.DemoService;
 

/** 
 * @author : HealerJean
 * @date   ： 2017年12月12日 下午2:57:39 
 * @Description:
 */
 
public class DemoServiceImpl implements DemoService {  
 
   public String sayHello(String name) {  
       return "Hello " + name;  
   }  
 
   public List getUsers() {  
       List list = new ArrayList();  

 
         
       list.add("HealerJean");  
       list.add("Zhangyujin");  
         
       return list;  
   }  
}  