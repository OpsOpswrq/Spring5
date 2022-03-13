package com.feng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.feng.Mapper")
@Import(UserConfig2.class)
public class UserConfig {

}
