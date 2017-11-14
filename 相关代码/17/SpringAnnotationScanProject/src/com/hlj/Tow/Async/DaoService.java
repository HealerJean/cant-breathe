package com.hlj.Tow.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年11月14日 下午3:33:51 
 * 类说明 
 */
@Service    
public class DaoService {    
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