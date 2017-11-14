package com.hlj.three.Schelule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年11月14日 下午5:04:42 
 * 类说明 
 */
@Component
public class MyTaskAnnotation {
	  
    /**  
     * 定时计算。每天凌晨 01:00 执行一次  
     */    
    @Scheduled(cron = "0 0 1 * * *")   
    public void show(){  
        System.out.println("Annotation：is show run");  
    }  
      
    /**  
     * 心跳更新。启动时执行一次，之后每隔2秒执行一次  
     */    
    @Scheduled(fixedRate = 1000*2)   
    public void print(){  
        System.out.println("Annotation：print run");  
    }  
}
