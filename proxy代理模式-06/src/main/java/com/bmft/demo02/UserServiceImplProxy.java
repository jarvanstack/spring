package com.bmft.demo02;

public class UserServiceImplProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 增加一个日志功能,不改变原有的的代码
     * 因为改变公司原有的业务代码是公司的大忌，大忌大忌
     */
    private void log(){
        System.out.println("[log]日志");
    }
    @Override
    public void add() {
        log();
        userService.add();
    }

    @Override
    public void delete() {
        log();
        userService.delete();
    }

    @Override
    public void update() {
        log();
        userService.update();
    }

    @Override
    public void query() {
        log();
        userService.query();
    }
}
