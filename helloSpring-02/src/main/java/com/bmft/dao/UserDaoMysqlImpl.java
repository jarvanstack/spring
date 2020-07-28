package com.bmft.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据UserDaoImpl");
    }
}
