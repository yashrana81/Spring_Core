package com.springcore.stereoAnno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_stereoAnno.xml");
        //Student.class to define the class

        //@component annotation converts the name of the bean to camel case
        Student st1 = context.getBean("st1",Student.class);
        System.out.println(st1);
        //to call destroyer function
        //context.registerShutdownHook();

    }
}