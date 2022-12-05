package de.neuefische.repo;

import de.neuefische.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;

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
