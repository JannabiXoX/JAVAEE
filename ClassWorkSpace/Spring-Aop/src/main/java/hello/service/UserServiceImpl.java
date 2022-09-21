package hello.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    public void add() {
        System.out.println("添加操作");
    }
    public void delete() {
        System.out.println("删除操作");
    }
    public void update() {
        System.out.println("更新操作");
    }
    public void select() {
        System.out.println("查询操作");
    }
}
