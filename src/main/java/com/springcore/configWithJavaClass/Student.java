package com.springcore.configWithJavaClass;

public class Student {
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(Book book) {
        this.book = book;
    }

    public Student() {
        super();
    }

    public void fun()
    {
        this.book.bookRead();
    }
}
