package com.dh.meli.cardealership.repository;

import com.dh.meli.cardealership.model.CarDealership;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDealerShipRepo {

    @Autowired
    private static final String DATA = "src/main/resources/dealership_data.json";


    private static ObjectMapper mapper = new ObjectMapper();

    public List<CarDealership> addCarInDealership(CarDealership carDealership) throws IOException {
        mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<CarDealership> actualCarList = Arrays.asList(mapper.readValue(new File(DATA), CarDealership[].class));

        List<CarDealership> copyListCar = new ArrayList<>(actualCarList);
        copyListCar.add(carDealership);

        mapper.writeValue(new File(DATA), copyListCar);

        return copyListCar;
    }


    public List<CarDealership> getAllVehicles() throws IOException {
        return Arrays.asList(mapper.readValue(new File(DATA), CarDealership[].class));
    }
}
