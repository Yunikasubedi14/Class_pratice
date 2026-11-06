
package com.westminster.classpratice.demo.productapi;

public class ServiceProduct extends Product implements Discountable {

    private int durationMinutes;
    private String serviceProvider;
    private boolean isOnline;
    private double discountedPrice;

    // Default constructor
    public ServiceProduct() {
        super();
    }

    // Parameterized constructor
    public ServiceProduct(int id, String name, int qty,
                          boolean inStock, double unitPrice,
                          int durationMinutes, String serviceProvider,
                          boolean isOnline) {

        super(id, name, qty, inStock, unitPrice);

        this.durationMinutes = durationMinutes;
        this.serviceProvider = serviceProvider;
        this.isOnline = isOnline;
        this.discountedPrice = unitPrice;
    }

    // Get Summary
    @Override
    public String getSummary() {
        return "Service Name: " + getName()
                + ", Service Provider: " + serviceProvider
                + ", Duration: " + durationMinutes + " minutes"
                + ", Status: " + (isOnline ? "Online" : "Offline");
    }


    @Override
    public String onFulfillOrder() {
        if (getInStock()) {
            return "Service booked successfully";
        } else {
            return "Service is currently unavailable";
        }
    }


    @Override
    public void applyDiscount(double rate) {

        if (rate < 0) {
            rate = 0;
        }

        if (rate > 15) {
            rate = 15;
        }

        discountedPrice = getUnitPrice()
                - (getUnitPrice() * rate / 100);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }


    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }
}

