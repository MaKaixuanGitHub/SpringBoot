package com.makaixuan.springboot.controller;

import com.makaixuan.springboot.entity.User;
import com.makaixuan.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @Autowired
    HelloService service;

    @RequestMapping("/hello")
    @ResponseBody
    public User getUser () {
        return service.getUser();
    }
}
