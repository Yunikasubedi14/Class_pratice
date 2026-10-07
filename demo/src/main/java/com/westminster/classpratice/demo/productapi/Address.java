package com.westminster.classpratice.demo.productapi;

public class Address {
    private int id;
    private String name;
    private String Province;
    private String City;
    private String Country;

    public Address(int id, String name,String Province,String City,String Country) {
        this.id = id;
        this.name = name;
        this.Province=Province;
        this.City=City;
        this.Country=Country;
    }
    public String getFullAddress() {
        return City + ", " + Province + ", " + Country;
    }
}
