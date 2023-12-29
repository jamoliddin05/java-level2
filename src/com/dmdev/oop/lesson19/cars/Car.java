package com.dmdev.oop.lesson19.cars;

import java.util.Objects;

public abstract class Car {
    private Brand brand;
    private Model model;
    private int year;
    private Color color;

    public Car(Brand brand, Model model, int year, Color color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
               Objects.equals(model, car.model) &&
               Objects.equals(year, car.year) &&
               color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, brand, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", year='" + year + '\'' +
               ", color=" + color +
               '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getProductionYear() {
        return year;
    }

    public void setProductionYear(int productionYear) {
        this.year = productionYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
