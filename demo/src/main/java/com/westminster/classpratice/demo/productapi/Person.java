package com.westminster.classpratice.demo.productapi;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private Date birth_date;
    private int age;
    private String address;

    public Person(int id, String name, Date birth_date, int age, String address) {
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}