package com.springcore.expressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class StaticMethodAndVariableInvoke {
    @Value("#{T(java.lang.Math).PI}")
    private int id;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double var2;

    @Value("#{new String('anss')}")
    private String s1;
    public StaticMethodAndVariableInvoke() {
        super();
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public StaticMethodAndVariableInvoke(int id, double var2) {
        this.id = id;
        this.var2 = var2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public StaticMethodAndVariableInvoke(int id, double var2, String s1) {
        this.id = id;
        this.var2 = var2;
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "StaticMethodAndVariableInvoke{" +
                "id=" + id +
                ", var2=" + var2 +
                ", s1='" + s1 + '\'' +
                '}';
    }
}
