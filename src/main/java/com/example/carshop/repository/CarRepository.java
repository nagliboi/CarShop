package com.example.carshop.repository;

import com.example.carshop.module.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Optional<Car> findByModelAndBrandAndManufactureYear(String carModel, String carBrand, Long carYear);
}
