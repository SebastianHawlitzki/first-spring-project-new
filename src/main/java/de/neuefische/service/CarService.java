package de.neuefische.service;

import de.neuefische.model.Car;
import de.neuefische.repo.CarRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {



    private final  CarRepo repo = new CarRepo();


    public Car addCar(Car car){
        return repo.addCar(car);
    }

    public List<Car> getCars(){
        return repo.getCars();
    }

}


