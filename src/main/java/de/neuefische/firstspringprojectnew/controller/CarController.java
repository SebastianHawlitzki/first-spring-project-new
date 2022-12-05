package de.neuefische.firstspringprojectnew.controller;

import de.neuefische.model.Car;
import de.neuefische.repo.CarRepo;
import de.neuefische.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final static CarService service = new CarService();

    @PostMapping
    public void postCar(@RequestBody Car car){
        service.addCar(car);

    }

    @GetMapping()
    public List<Car> carList(){
        return service.getCars();
    }

    }




