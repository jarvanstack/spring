package com.bmft.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;


public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("========[LogAfter]=========");
        System.out.println("类:"+o1.getClass().getName());
        System.out.println("方法："+method.getName());
        System.out.println("参数："+ Arrays.toString(objects));
        System.out.println("返回值："+o);
    }
}
