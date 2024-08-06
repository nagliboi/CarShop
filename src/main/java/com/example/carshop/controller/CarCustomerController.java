package com.example.carshop.controller;

import com.example.carshop.dto.RentalInfo;
import com.example.carshop.module.CarCustomer;
import com.example.carshop.service.CarCustomerService;
import com.example.carshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("service")
public class CarCustomerController {

    @Autowired
    CarCustomerService carCustomerService;

    @PostMapping
    public CarCustomer rentCar (@RequestBody RentalInfo rentalInfo) {
        return carCustomerService.addCarCustomer(rentalInfo.getCustomerId(), rentalInfo.getCustomerName(), rentalInfo.getCarBrand(), rentalInfo.getCarModel(), rentalInfo.getCarYear());
    }
}
