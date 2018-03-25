package com.company;

public class Phone extends Characteristics implements PriceAndYear {

    int batteryCapacity;

    public Phone() {
    }

    public Phone(String name, double price, int yearOfManufacture, int batteryCapacity, Fabricator fabricator) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.batteryCapacity = batteryCapacity;
        this.fabricator = fabricator;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name = " + name +
                ", batteryCapacity = " + batteryCapacity +
                ", price = " + price +
                ", yearOfManufacture = " + yearOfManufacture +
                ", fabricator = " + fabricator +
                '}';
    }
}