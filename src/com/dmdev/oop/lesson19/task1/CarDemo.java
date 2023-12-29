package com.dmdev.oop.lesson19.task1;

import com.dmdev.oop.lesson19.cars.*;
import com.dmdev.oop.lesson19.garage.Garage;

public class CarDemo {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Truck(Brand.VOLVO, Model.STATION_WAGON, 2020, Color.RED, 10));
        garage.park(new Truck(Brand.MERCEDES, Model.STATION_WAGON, 2020, Color.WHITE, 15));
        garage.park(new RacingCar(Brand.BMV, Model.SEDAN, 2018, Color.BLACK, 220));
        garage.park(new RacingCar(Brand.BMV, Model.SEDAN, 2017, Color.BLACK, 220));
        System.out.println(garage);
        System.out.println(garage.getCarCountByBrand(Brand.BMV));

        garage.departure(new RacingCar(Brand.BMV, Model.SEDAN, 2018, Color.BLACK, 220));
        System.out.println(garage);
        System.out.println(garage.getCarCountByModel(Model.SEDAN));
    }
}
