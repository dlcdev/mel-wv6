package com.dh.meli.calorycalculator.repository;

import com.dh.meli.calorycalculator.model.Dish;
import com.dh.meli.calorycalculator.model.Ingredients;
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
public class DishRepo {

    @Autowired
    private static final String DATA = "src/main/resources/dish.json";
    private static ObjectMapper mapper = new ObjectMapper();

    public List<Dish> getAllDish() throws IOException {
        return Arrays.asList(mapper.readValue(new File(DATA), Dish[].class));
    }

    public Dish createDish(Dish dishInput) throws IOException {

        mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Dish> actualDishList = null;
        List<Dish> copyDishList = null;

        actualDishList = Arrays.asList(mapper.readValue(new File(DATA), Dish[].class));
        copyDishList = new ArrayList<>(actualDishList);
        copyDishList.add(dishInput);

        writer.writeValue(new File(DATA), copyDishList);
        return dishInput;


    }




}
