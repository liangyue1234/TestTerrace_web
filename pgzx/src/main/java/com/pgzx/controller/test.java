package com.pgzx.controller;

import com.pgzx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping(value = "/pgzx")
public class test {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String name(Map map){
        User user=new User();
        user.setUsername("梁越");
        user.setPassword("123456");
        
        return "index";
    }
}
