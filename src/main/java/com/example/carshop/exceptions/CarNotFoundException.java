package com.example.carshop.exceptions;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("Car not found bro");
    }
}
