package dao;

public class UserDaoOrc implements UserDao{
    @Override
    public void getUser() {
        System.out.print("oracle 操作数据库");
    }
}
