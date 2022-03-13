package com.feng.pojo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserServiceAnnotation {
    @Before("execution(* com.feng.pojo.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("这个是之前的方法");
    }
    @After("execution(* com.feng.pojo.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("这个是之后的方法");
    }
}
