package com.dh.meli.cardealership.service;

import com.dh.meli.cardealership.dto.CarDealershipDto;
import com.dh.meli.cardealership.model.CarDealership;
import com.dh.meli.cardealership.repository.CarDealerShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDealershipServiceImpl implements CarDealershipService {

    @Autowired
    private CarDealerShipRepo carDealerShipRepo;

    @Override
    public List<CarDealership> addCarInDealership(CarDealership carDealership) throws IOException {
        return carDealerShipRepo.addCarInDealership(carDealership);
    }

    @Override
    public List<CarDealershipDto> getAllVehicles() throws IOException {

        List<CarDealership> carDealershipList = carDealerShipRepo.getAllVehicles();
        return carDealershipList.stream()
                .map(CarDealershipDto::new).collect(Collectors.toList());
    }

    @Override
    public List<CarDealershipDto> getAllVehiclesToDate(String date) throws IOException {
        List<CarDealership> carDealershipList = carDealerShipRepo.getAllVehicles();

        return carDealershipList.stream()
                .filter(d -> d.getManufacturingDate().equals(date))
                .map(CarDealershipDto::new)
                .collect(Collectors.toList());
    }
}
