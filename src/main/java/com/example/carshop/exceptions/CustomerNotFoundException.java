package com.example.carshop.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("Customer Not Found bro");
    }
}
