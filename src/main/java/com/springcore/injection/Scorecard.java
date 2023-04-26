package com.springcore.injection;

import com.springcore.injection.Student;

public class Scorecard {
    private int total;
    private int percentage;
    private Student s1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setS1(Student s1) {
        this.s1 = s1;
    }

    public int getPercentage() {
        return percentage;
    }

    public Student getS1() {
        return s1;
    }

    public Scorecard() {
        super();
    }

    public Scorecard(int total, int percentage, Student s1) {
        this.total = total;
        this.percentage = percentage;
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "Scorecard{" +
                "total=" + total +
                ", percentage=" + percentage +
                ", s1=" + s1 +
                '}';
    }

    public void init()
    {
        System.out.println("init for scorecard called");
    }

    public void destroy()
    {
        System.out.println("destroyer for scorecard called");
    }
}
