package com.gfg.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student(){
        return new Student(1,"geek");
    }

    @Bean
    public Teacher teacher(){
        return new Teacher();
    }
}
