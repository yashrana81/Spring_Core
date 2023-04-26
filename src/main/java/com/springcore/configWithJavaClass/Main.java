package com.springcore.configWithJavaClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student s1=context.getBean("temp1",Student.class);
        s1.fun();
    }
}
