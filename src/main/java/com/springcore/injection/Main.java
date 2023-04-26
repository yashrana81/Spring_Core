package com.springcore.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_injection.xml");
        Scorecard st1 =(Scorecard) context.getBean("scorecard1");
        System.out.println(st1);
        //to call destroyer function
        context.registerShutdownHook();

    }
}