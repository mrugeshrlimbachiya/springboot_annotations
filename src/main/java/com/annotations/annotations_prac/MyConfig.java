package com.annotations.annotations_prac;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"myPack"})
public class MyConfig {

    @Bean
    public Student getStudent(){
        System.out.println("Creating Student object");
        return new Student();
    }

    @Bean
    public Date getDate(){
        System.out.println("Creating new date");
        return new Date();
    }

}
