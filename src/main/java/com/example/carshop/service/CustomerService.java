package com.example.carshop.service;

import com.example.carshop.exceptions.CustomerNotFoundException;
import com.example.carshop.module.Customer;
import com.example.carshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        if (customer.getLicensed() == null){
            customer.setLicensed(false);
        }
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        Customer oldCustomer = getCustomerById(customer.getId());
        if (oldCustomer == null) {
            throw new CustomerNotFoundException();
        }
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(CustomerNotFoundException::new);
    }

    public String updateLicense (Long id){
        Customer customer = getCustomerById(id);
        if (customer == null) {
            throw new CustomerNotFoundException();
        }
        if (customer.getLicensed()){
            customer.setLicensed(false);
            customerRepository.save(customer);
            return "License has been revoked for customer " + customer.getId();
        }else {
            customer.setLicensed(true);
            customerRepository.save(customer);
            return "License has been revoked for customer " + customer.getId();
        }



    }
}
