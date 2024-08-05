package com.example.carshop.controller;

import com.example.carshop.module.Car;
import com.example.carshop.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car postCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
        return "Car with id "+ id + " deleted";
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id){
        return carService.getCar(id);
    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getAllCars();
    }

    @PutMapping("/{id}")
    public Car putCar(@PathVariable Long id, @RequestBody Car car){
        return carService.updateCar(id, car);
    }
}
