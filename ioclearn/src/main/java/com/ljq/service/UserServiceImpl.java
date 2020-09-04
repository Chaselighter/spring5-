package com.ljq.service;

import com.ljq.dao.UserDao;
import com.ljq.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser(int a,int b) {
        System.out.println("yesyes"+a+b);
        //userDao.getUser();
    }
}
