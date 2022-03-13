package com.feng;

import com.feng.Mapper.Hello;
import com.feng.Mapper.SetInsert;
import com.feng.Mapper.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCtest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello3");
        System.out.println(hello.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SetInsert setInsert = context.getBean("setInsert", SetInsert.class);
        System.out.println(setInsert);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user3", User.class);
        User user4 = context.getBean("user4", User.class);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
