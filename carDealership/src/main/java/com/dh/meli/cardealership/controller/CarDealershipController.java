package com.dh.meli.cardealership.controller;

import com.dh.meli.cardealership.dto.CarDealershipDto;
import com.dh.meli.cardealership.model.CarDealership;
import com.dh.meli.cardealership.model.CarServices;
import com.dh.meli.cardealership.service.CarDealershipService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarDealershipController {

    @Autowired
    private CarDealershipService carServices;

    @PostMapping("/vehicles")
    public ResponseEntity<List<CarDealership>> addCarInDealership(@RequestBody CarDealership carDealership) throws IOException {
        return new ResponseEntity<>(carServices.addCarInDealership(carDealership), HttpStatus.OK);
    }

    @GetMapping("/vehicles")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CarDealershipDto>> getAllVehicles() throws IOException {
        return ResponseEntity.ok(carServices.getAllVehicles());
    }

    @GetMapping("/vehicles/{date}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CarDealershipDto>> getAllVehiclesToDate(@RequestParam String date) throws IOException {
        return ResponseEntity.ok(carServices.getAllVehiclesToDate(date));
    }


}
