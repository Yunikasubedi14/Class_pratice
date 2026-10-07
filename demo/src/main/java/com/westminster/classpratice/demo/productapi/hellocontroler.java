package com.westminster.classpratice.demo.productapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {
    @GetMapping("/api/product")
    public String hello() {
        return "Hello from java.";
    }

    @GetMapping("/api/address")
    public String address() {
        Address address = new Address(109, "Home", "Bagmati", "Kathmandu", "Nepal");
        return address.getFullAddress();
    }
}