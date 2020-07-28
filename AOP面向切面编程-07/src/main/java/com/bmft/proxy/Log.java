package com.bmft.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("========[Log]=========");
        System.out.println("类:"+o.getClass().getName());
        System.out.println("方法："+method.getName());
        System.out.println("参数："+ Arrays.toString(objects));
    }
}
