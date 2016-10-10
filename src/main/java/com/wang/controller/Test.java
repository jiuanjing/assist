package com.wang.controller;

import com.wang.dao.UserDao;
import com.wang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping("/test")
    public String test() {
        return "success";
    }
    @RequestMapping("/test1")
    public String tes1() {
        return "success";
    }
    @Autowired
    UserDao userDao;

    void test3(){
        User user = new User(6,"de");
        userDao.addUser(user);
    }
}
