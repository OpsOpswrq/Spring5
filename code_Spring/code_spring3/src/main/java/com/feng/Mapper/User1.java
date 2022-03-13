package com.feng.Mapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User1 {
    public String name;

    public User1() {
    }

    public User1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Value("feng")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
