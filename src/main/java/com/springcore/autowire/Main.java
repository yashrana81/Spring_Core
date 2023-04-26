package com.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_autowire.xml");
        //Scorecard st1 =(Scorecard) context.getBean("scorecard1");
        //System.out.println(st1);
        //to call destroyer function
        context.registerShutdownHook();
        Employee emp1=context.getBean("emp1", Employee.class);
        System.out.println(emp1);

    }
}