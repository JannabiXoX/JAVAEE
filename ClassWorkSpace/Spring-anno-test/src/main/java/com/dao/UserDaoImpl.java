package com.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void show() {
        System.out.println("Dao 打印");
    }
}
