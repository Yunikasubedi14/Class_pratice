package com.westminster.classpratice.demo.productapi;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(int id, String name, int qty,
                           boolean inStock, double price,
                           double weightKg, String dimensions) {

        super(id, name, qty, inStock, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return this.weightKg;
    }

    public String getDimensions() {
        return this.dimensions;
    }
}
