package com.dmdev.oop.lesson28;

@Table(name = "car", schema = "garage")
public class Car {

    @Column(name = "model")
    private String model;

    @Column(name = "brand")
    private String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", brand='" + brand + '\'' +
               '}';
    }
}
