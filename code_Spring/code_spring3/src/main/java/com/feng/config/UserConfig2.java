package com.feng.config;


import com.feng.Mapper.User1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.feng.Mapper")
public class UserConfig2 {
    @Bean
    public User1 setUser(){
        System.out.println("nihao");
        return new User1();
    }
}
