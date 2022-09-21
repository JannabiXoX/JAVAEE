package com.service;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Repository
public class UserService {
    @Value("张三")
    private String username;

//    @Autowired
//    @Qualifier(value = "userDaoImpl2")
    @Resource(name = "userDaoImpl2")
    private UserDao userDao;

    public void print(){
        userDao.show();
        System.out.println("Service打印"+username);
    }
}
