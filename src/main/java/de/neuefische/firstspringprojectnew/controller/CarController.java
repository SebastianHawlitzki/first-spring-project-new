package de.neuefische.firstspringprojectnew.controller;

import de.neuefische.firstspringprojectnew.model.Car;
import de.neuefische.firstspringprojectnew.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService service = new CarService();

    @PostMapping
    public Car postCar(@RequestBody Car car){
        return service.addCar(car);

    }

    @GetMapping()
    public List<Car> carList(){
        return service.getCars();
    }

    }





