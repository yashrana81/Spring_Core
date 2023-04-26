package com.springcore.expressionLang;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_expressionLang.xml");
        //Student.class to define the class

        //@component annotation converts the name of the bean to camel case
        StaticMethodAndVariableInvoke st1 = context.getBean("obj", StaticMethodAndVariableInvoke.class);
        System.out.println(st1);
        //to call destroyer function
        //context.registerShutdownHook();

    }
}