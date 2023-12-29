package com.dmdev.oop.lesson19.garage;

import com.dmdev.oop.lesson19.cars.Brand;
import com.dmdev.oop.lesson19.cars.Car;
import com.dmdev.oop.lesson19.cars.Color;
import com.dmdev.oop.lesson19.cars.Model;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private final Map<Car, Integer> garage = new HashMap<>();

    public void park(Car car) {
        int oldCount = garage.getOrDefault(car, 0);
        garage.put(car, oldCount + 1);
    }

    public void departure(Car car) {
        int oldCount = garage.getOrDefault(car, 0);
        int newCount = oldCount == 0 ? 0 : oldCount - 1;
        garage.put(car, newCount);
    }

    public int getCarCountByBrand(Brand brand) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            if (entry.getKey().getBrand() == brand) {
                result++;
            }
        }

        return result;
    }

    public int getCarCountByModel(Model model) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            if (entry.getKey().getModel() == model) {
                result++;
            }
        }

        return result;
    }

    public int getCarCountByColor(Color color) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            if (entry.getKey().getColor() == color) {
                result++;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
               "garage=" + garage +
               '}';
    }
}
