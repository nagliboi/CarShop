package com.example.carshop.service;

import com.example.carshop.exceptions.CarNotFoundException;
import com.example.carshop.module.Car;
import com.example.carshop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public Car getCar(Long id) {
        return carRepository.findById(id).orElseThrow(CarNotFoundException::new);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car updateCar(Long id, Car car) {
        Car oldCar = getCar(id);
        oldCar.setBrand(car.getBrand());
        oldCar.setModel(car.getModel());
        oldCar.setManufactureYear(car.getManufactureYear());
        carRepository.save(oldCar);
        return oldCar;
    }
}
