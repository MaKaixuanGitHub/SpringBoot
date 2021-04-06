package com.makaixuan.springboot.service;

import com.makaixuan.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    User u;

    public User getUser () {
        User user = new User();
        user.setUserName(u.getUserName());
        user.setPassWord(u.getPassWord());
        user.setAge(u.getAge());
        return user;
    }
}
