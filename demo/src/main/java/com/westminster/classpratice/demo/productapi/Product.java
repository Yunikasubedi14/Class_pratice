package com.westminster.classpratice.demo.productapi;

public class Product {

    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double price;

    public Product(int id, String name, int qty, boolean inStock, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.price = price;
    }

    public double calculateTotal() {
        return price * qty;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getQty() {
        return this.qty;
    }

    public boolean isInStock() {
        return this.inStock;
    }

    public double getPrice() {
        return this.price;
    }
}