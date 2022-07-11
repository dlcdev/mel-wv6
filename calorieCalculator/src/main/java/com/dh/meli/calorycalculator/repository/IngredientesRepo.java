package com.dh.meli.calorycalculator.repository;

import com.dh.meli.calorycalculator.model.Ingredients;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class IngredientesRepo {
    private static final String DATA = "src/main/resources/food.json";
    private static ObjectMapper mapper = new ObjectMapper();

    public List<Ingredients> getAllIngredients() throws IOException {
        return Arrays.asList(mapper.readValue(new File(DATA), Ingredients[].class));
    }

}
