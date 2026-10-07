package com.westminster.classpratice.demo.productapi;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private Date birth_date;
    private int age;

    public Person(int id, String name, Date birth_date, int age) {
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        this.age = age;
    }
    public String getage(){
        return age+" ";
    }

}
