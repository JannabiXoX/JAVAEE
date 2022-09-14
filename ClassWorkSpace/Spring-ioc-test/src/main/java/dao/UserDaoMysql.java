package dao;

public class UserDaoMysql implements UserDao{

    @Override
    public void getUser() {
        System.out.print("MySql 操作数据库");
    }
}
