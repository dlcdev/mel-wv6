package com.dh.meli.cardealership.dto;

import com.dh.meli.cardealership.model.CarDealership;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarDealershipDto {
    private String brand;
    private String model;
    private String manufacturingDate;
    private Integer numberOfKilometers;
    private Integer doors;
    private double price;
    private String currency;
    private Integer countOfOwners;

    public CarDealershipDto(CarDealership carDealership) {
        this.brand = carDealership.getBrand();
        this.model = carDealership.getModel();
        this.manufacturingDate = carDealership.getManufacturingDate();
        this.numberOfKilometers = carDealership.getNumberOfKilometers();
        this.doors = carDealership.getDoors();
        this.price = carDealership.getPrice();
        this.currency = carDealership.getCurrency();
        this.countOfOwners = carDealership.getCountOfOwners();
    }
}
