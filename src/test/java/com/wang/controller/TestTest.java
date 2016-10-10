package com.wang.controller;

import com.wang.dao.UserDao;
import com.wang.entity.User;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wang on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestTest {
    @Resource
    private UserDao userDao;
    @org.junit.Test
    public void test3() throws Exception {
        User user = new User(7,"de");
        userDao.addUser(user);
    }

}