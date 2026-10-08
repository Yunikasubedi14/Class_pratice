package com.westminster.classpratice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class Product_Controller {

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {

        Product product = new Product(
                id,
                "Laptop",
                10,
                true,
                99.99
        );

        return product;
    }
}