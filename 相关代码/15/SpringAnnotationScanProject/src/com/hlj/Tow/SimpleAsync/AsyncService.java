package com.hlj.Tow.SimpleAsync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��11��14�� ����3:33:51 
 * ��˵�� 
 */
@Service    
public class AsyncService {    
	//@Async�����εĺ�����Ҫ����Ϊstatic���� or ��public�������첽���ò�����Ч 
   @Async  
    public void update() {    
        try {    
            Thread.sleep(2000);    
            // do something    
        } catch (InterruptedException e) {    
            e.printStackTrace(); 
        }
        System.out.println("operation complete.");    
    }    
}  