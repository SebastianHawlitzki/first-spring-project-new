package de.neuefische.firstspringprojectnew.repo;

import de.neuefische.firstspringprojectnew.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepo {

    List<Car> carList = new ArrayList<Car>();


    // Auto zur Liste hinzufügen
    public Car addCar(Car car) {
        this.carList.add(car);
        return car;
    }

    public List<Car> getCars() {
        return carList;
    }
}
