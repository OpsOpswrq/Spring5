package com.feng.Utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxy1 implements InvocationHandler {
    private Object target;

    public Proxy1(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    public void seeHouse(){
        System.out.println("看房子了");
    }
    public void Fare(){
        System.out.println("收钱了");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object invoke = method.invoke(target, args);
        Fare();
        System.out.println(method.getName());
        return invoke;
    }
}
