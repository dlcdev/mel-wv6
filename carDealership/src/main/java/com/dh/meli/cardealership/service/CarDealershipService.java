package com.dh.meli.cardealership.service;

import com.dh.meli.cardealership.dto.CarDealershipDto;
import com.dh.meli.cardealership.model.CarDealership;

import java.io.IOException;
import java.util.List;

public interface CarDealershipService {
    List<CarDealership> addCarInDealership(CarDealership carDealership) throws IOException;
    List<CarDealershipDto> getAllVehicles() throws IOException;

    List<CarDealershipDto> getAllVehiclesToDate(String date) throws IOException;
}
