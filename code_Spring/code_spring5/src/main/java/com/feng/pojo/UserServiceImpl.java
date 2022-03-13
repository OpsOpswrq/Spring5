package com.feng.pojo;

public class UserServiceImpl implements UserService{
    @Override
    public int add() {
        System.out.println("增加一个新的用户");
        return 1;
    }

    @Override
    public void delete() {
        System.out.println("减少了一个老用户");
    }
}
