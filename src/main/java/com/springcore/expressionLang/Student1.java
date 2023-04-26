package com.springcore.expressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student1 {
    @Value("#{2+9+34}")
    private int studentId;
    @Value("#")
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public Student1(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student1() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
