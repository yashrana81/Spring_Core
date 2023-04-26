package com.springcore.stereoAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("st1")
public class Student {
    //@value annotation to provide value to the bean declared using @Component
    @Value("yash rana")
    private String Name;
    @Value("mzn")
    private String Address;

    //define standalone collection in xml and fetch it using ("#{id of collection}")
    @Value("#{list1}")
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(String name, String address) {
        Name = name;
        Address = address;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", friends=" + friends +
                '}';
    }
}
