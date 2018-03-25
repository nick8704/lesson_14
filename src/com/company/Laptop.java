package com.company;

public class Laptop extends Characteristics implements PriceAndYear {

    double ram;

    public Laptop() {
    }

    public Laptop(String name, double price, int yearOfManufacture, double ram, Fabricator fabricator) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.ram = ram;
        this.fabricator = fabricator;
    }

    public double getRam() {
        return ram;
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
    public Fabricator getFabricator() {
        return fabricator;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name = " + name +
                ", RAM = " + ram +
                ", price = " + price +
                ", yearOfManufacture = " + yearOfManufacture +
                ", fabricator = " + fabricator +
                '}';
    }
}