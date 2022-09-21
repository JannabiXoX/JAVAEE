package com.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl2")
public class UserDaoImpl2 implements UserDao{

    @Override
    public void show() {
        System.out.println("Dao2 打印");
    }
}
