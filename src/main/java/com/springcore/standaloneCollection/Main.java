package com.springcore.standaloneCollection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_standalone.xml");
        //Student.class to define the class
        Student st1 =(Student) context.getBean("student1",Student.class);
        System.out.println(st1);
        //to call destroyer function
        //context.registerShutdownHook();

    }
}