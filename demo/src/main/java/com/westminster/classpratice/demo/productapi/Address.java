package com.westminster.classpratice.demo.productapi;

public class Address {

    private int id;
    private String name;
    private String province;
    private String city;
    private String country;

    public Address(int id, String name, String province, String city, String country) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.city = city;
        this.country = country;
    }

    public String getFullAddress() {
        return city + ", " + province + ", " + country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}