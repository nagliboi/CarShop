package com.example.carshop.service;

import com.example.carshop.module.CarCustomer;
import com.example.carshop.module.Customer;
import com.example.carshop.repository.CarCustomerRepository;
import com.example.carshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCustomerService {

    @Autowired
    private CarCustomerRepository carCustomerRepository;
    @Autowired
    private CustomerRepository customerRepository;
//
//    public CarCustomer addCarCustomer(String customerName, String car) {
//        Customer customer = customerRepository.;
//    }
}
