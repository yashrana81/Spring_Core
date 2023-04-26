package com.springcore.configWithJavaClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Book getBook()
    {
        Book b1=new Book();
        return b1;
    }
//    By default Name of the function becomes the name of the bean when called using application context
    @Bean({"temp1","temp2","temp3"})
    public Student getStudent()
    {
        Student s1=new Student(getBook());
        return s1;
    }
}
