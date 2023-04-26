package com.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private List<String>friends;
    private Map<String,Integer>feesStructure;

    public Map<String, Integer> getFeesStructure() {
        return feesStructure;
    }

    public void setFeesStructure(Map<String, Integer> feesStructure) {
        this.feesStructure = feesStructure;
    }

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Student(String name, List<String> friends, Map<String, Integer> feesStructure) {
        this.name = name;
        this.friends = friends;
        this.feesStructure = feesStructure;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                ", feesStructure=" + feesStructure +
                '}';
    }
}
