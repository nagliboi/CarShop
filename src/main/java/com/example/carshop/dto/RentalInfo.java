package com.example.carshop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentalInfo {

    private Long customerId;
    private String customerName;
    private String carModel;
    private String carBrand;
    private Long carYear;
}
