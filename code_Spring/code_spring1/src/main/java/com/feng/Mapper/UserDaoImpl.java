package com.feng.Mapper;

public class UserDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("这个是Dao层");
    }
}
