package com.springcore.annotations.init;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config_annotations_init.xml");
        //to call destroyer function
        context.registerShutdownHook();
        Annotations an1= (Annotations) context.getBean("exampleAnnotation");
        System.out.println(an1);

    }
}