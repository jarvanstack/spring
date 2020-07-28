package com.bmft.demo03;

import com.bmft.demo02.UserService;
import com.bmft.demo02.UserServiceImpl;

/**
 * 动态代理01测试类
 */
public class Client {
    public static void main(String[] args) {
        //真实对象
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent) pih.getProxy();//（错误）这里要用接口，而不是实现类
        proxy.rent();

    }
}
