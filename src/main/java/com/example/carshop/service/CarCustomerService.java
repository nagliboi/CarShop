package com.example.carshop.service;

import com.example.carshop.exceptions.CarNotFoundException;
import com.example.carshop.exceptions.CustomerNotFoundException;
import com.example.carshop.module.Car;
import com.example.carshop.module.CarCustomer;
import com.example.carshop.module.Customer;
import com.example.carshop.repository.CarCustomerRepository;
import com.example.carshop.repository.CarRepository;
import com.example.carshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCustomerService {

    @Autowired
    private CarCustomerRepository carCustomerRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CarRepository carRepository;

    public CarCustomer addCarCustomer(Long customerId, String customerName, String carBrand, String carModel, Long carYear) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(CustomerNotFoundException::new);
        Car car = carRepository.findByModelAndBrandAndManufactureYear(carModel, carBrand, carYear).orElseThrow(CarNotFoundException::new);
        CarCustomer carCustomer = new CarCustomer();
        carCustomer.setCustomerID(customerId);
        carCustomer.setCustomerName(customerName);
        carCustomer.setCarID(car.getId());
        carCustomer.setCarModel(carModel);
        carCustomer.setCarBrand(carBrand);
        carCustomer.setCarYear(carYear);
        return carCustomerRepository.save(carCustomer);

    }
}
