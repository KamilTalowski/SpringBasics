package org.kamil;

public class Tire {

    private String brand;

    public Tire(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Its working... Tire{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
