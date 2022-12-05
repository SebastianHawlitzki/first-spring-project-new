package de.neuefische.service;

import de.neuefische.model.Car;
import de.neuefische.repo.CarRepo;

import java.util.List;


public class CarService {



    private final static CarRepo repo = new CarRepo();


    public void addCar(Car car){
        repo.addCar(car);
    }

    public List<Car> getCars(){
        return repo.getCars();
    }

}


