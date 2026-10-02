package com.westminster.classpratice.demo.productapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {
    @GetMapping("/api/product")
    public String hello() {
        return "Hello from java.";
    }
}