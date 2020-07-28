package com.bmft.aop03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // Aspect是切面的意思，等同于test02 beans.xml的 <aop:aspect ref="diy">
public class DiyAnnoProxy {
    @Before("execution(* com.bmft.aop03.UserServiceImpl03.*(..))")
    public void before(){
        System.out.println("=====before=======");
    }
    @After("execution(* com.bmft.aop03.UserServiceImpl03.*(..))")
    public void after() {
        System.out.println("=====after=======");
    }
    @Around("execution(* com.bmft.aop03.UserServiceImpl03.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====around-before=======");
        System.out.println(pjp.getSignature());
        pjp.proceed();//执行方法
        System.out.println("=====around-after=======");

    }

}
