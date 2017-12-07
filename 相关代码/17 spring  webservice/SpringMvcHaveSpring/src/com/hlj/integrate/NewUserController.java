package com.hlj.integrate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NewUserController {
    @Autowired   
    private NewUserService userService;
    
    @ResponseBody
    @RequestMapping("/user")
    public String saveUser(@RequestBody @ModelAttribute NewUser u){
        System.out.println(u);
        userService.save();
        return "hello";
    }
}
