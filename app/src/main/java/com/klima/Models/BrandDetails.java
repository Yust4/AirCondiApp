package com.klima.Models;

class BrandDetails {
    String brand;
    String type;
    double power;
    int price;

    public BrandDetails(String brand, String type, double power, int price) {
        this.brand = brand;
        this.type = type;
        this.power = power;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
