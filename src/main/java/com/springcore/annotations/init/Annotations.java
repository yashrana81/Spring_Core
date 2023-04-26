package com.springcore.annotations.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotations {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Annotations(String subject) {
        this.subject = subject;
    }

    public Annotations() {
        super();
    }

    @PostConstruct
    public void init()
    {
        System.out.println("initialisation function of annotations called");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy function of annotations called");
    }

    @Override
    public String toString() {
        return "annotations{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
