package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
   // @Autowired
    private Address address;


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
     //   System.out.println("setter method");
    }

    @Autowired
    public Employee(Address address) {
        this.address = address;
       System.out.println("constructor");
    }

   // @Override
    public String toString() {
        return "employee{" +
                "address=" + address +
                '}';
    }
}
