package com.company;

public class Monitor extends Characteristics implements PriceAndYear {

    double diagonal;

    public Monitor() {
    }

    public Monitor(String name, double price, int yearOfManufacture, double diagonal, Fabricator fabricator) {
        this.name = name;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.diagonal = diagonal;
        this.fabricator = fabricator;
    }

    public double getDiagonal() {
        return diagonal;
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
        return "Monitor{" +
                "name = " + name +
                ", diagonal = " + diagonal +
                ", price = " + price +
                ", yearOfManufacture = " + yearOfManufacture +
                ", fabricator = " + fabricator +
                '}';
    }
}