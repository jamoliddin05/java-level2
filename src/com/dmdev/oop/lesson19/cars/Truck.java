package com.dmdev.oop.lesson19.cars;

import java.util.Objects;

public class Truck extends Car {

    private double liftingCapacity;

    public Truck(Brand brand, Model model, int year, Color color, double liftingCapacity) {
        super(brand, model, year, color);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(liftingCapacity, truck.liftingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
               "liftingCapacity=" + liftingCapacity +
               '}' + super.toString();
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }
}
