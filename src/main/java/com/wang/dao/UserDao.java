package com.wang.dao;

import com.wang.entity.User;

import java.util.List;

/**
 * 用户的dao类
 * Created by wang on 2016/10/6.
 */
public interface UserDao {

    /**
     * 查询所有用户
     * @return list<user>
     */
    List<User> queryAll();
    User queryById(int id);

    void addUser(User user);

    int updateUser(int id);

}
