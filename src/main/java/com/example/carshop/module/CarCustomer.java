package com.example.carshop.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CarCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long customerID;

    @Column
    private String customerName;

    @Column
    private Long carID;

    @Column
    private String carBrand;

    @Column
    private String carModel;

    @Column
    private Long carYear;


}
