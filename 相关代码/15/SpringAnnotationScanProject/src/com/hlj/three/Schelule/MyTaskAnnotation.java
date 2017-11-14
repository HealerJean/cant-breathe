package com.hlj.three.Schelule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��11��14�� ����5:04:42 
 * ��˵�� 
 */
@Component
public class MyTaskAnnotation {
	  
    /**  
     * ��ʱ���㡣ÿ���賿 01:00 ִ��һ��  
     */    
    @Scheduled(cron = "0 0 1 * * *")   
    public void show(){  
        System.out.println("Annotation��is show run");  
    }  
      
    /**  
     * �������¡�����ʱִ��һ�Σ�֮��ÿ��2��ִ��һ��  
     */    
    @Scheduled(fixedRate = 1000*2)   
    public void print(){  
        System.out.println("Annotation��print run");  
    }  
}
