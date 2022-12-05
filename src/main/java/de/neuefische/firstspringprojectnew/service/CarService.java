package de.neuefische.firstspringprojectnew.service;

import de.neuefische.firstspringprojectnew.model.Car;
import de.neuefische.firstspringprojectnew.repo.CarRepo;
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


