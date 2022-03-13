package com.feng.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {
    private String name;
    @Resource(name = "dog222")
    private Dog dog;
    @Resource
    private Cat cat;

    public People() {
    }

    public People(String name,Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }



    public Cat getCat() {
        return this.cat;
    }



    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
