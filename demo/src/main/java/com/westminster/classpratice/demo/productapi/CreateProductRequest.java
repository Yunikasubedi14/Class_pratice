package com.westminster.classpratice.demo.productapi;

public record CreateProductRequest(
        String name,
        int qty,
        boolean inStock,
        double unitPrice

) {
}