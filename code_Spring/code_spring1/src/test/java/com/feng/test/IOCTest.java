package com.feng.test;


import com.feng.Service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void test() {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userDao = (UserServiceImpl) Context.getBean("userserviceimpl");
        System.out.println(userDao);
    }
}
