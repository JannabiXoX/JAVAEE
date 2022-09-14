package service;

import dao.UserDao;
import dao.UserDaoMysql;
import dao.UserDaoOrc;
import dao.UserDaoSqlServer;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoMysql();
//    private UserDao userDao = new UserDaoSqlServer();
//    private UserDao userDao = new UserDaoOrc();
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
