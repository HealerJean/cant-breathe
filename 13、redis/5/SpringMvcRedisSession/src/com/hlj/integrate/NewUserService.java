package com.hlj.integrate;

import org.springframework.stereotype.Component;


@Component // ���������component��ɨ����� <context:component-scan base-package=��com.mmnc��>  
public class NewUserService {
    public NewUserService(){
        System.out.println("UserService Constructor...\n\n\n\n\n\n");
    }
    
    public void save(){
        System.out.println("save");
    }
}