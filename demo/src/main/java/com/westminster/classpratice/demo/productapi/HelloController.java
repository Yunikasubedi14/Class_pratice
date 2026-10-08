package com.westminster.classpratice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from java.";
    }

    @GetMapping("/api/address/{city}")
    public String address(@PathVariable String city) {

        Address address = new Address(
                109,
                "Dallu",
                "Bagmati",
                city,
                "Nepal"
        );

        return address.getFullAddress();
    }
}