package com.bmft.aop02;

import com.bmft.service.UserService;


public class UserServiceImpl2 implements UserService{

    @Override
    public void insert() {
        System.out.println("UserServiceImpl--"+"insert");
    }

    @Override
    public void delete() {
        System.out.println("UserServiceImpl--"+"delete");
    }

    @Override
    public void update() {
        System.out.println("UserServiceImpl--"+"update");

    }

    @Override
    public void select() {
        System.out.println("UserServiceImpl--"+"select");

    }
}
