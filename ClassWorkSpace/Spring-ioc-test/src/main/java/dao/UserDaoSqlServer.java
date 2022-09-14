package dao;

public class UserDaoSqlServer implements UserDao{

    @Override
    public void getUser() {
        System.out.print("Sqlserver 操作数据库");
    }
}
