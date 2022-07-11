package com.dh.meli.calorycalculator.service;

import com.dh.meli.calorycalculator.model.Ingredients;

import java.io.IOException;
import java.util.List;

public interface IngredientsService {
    public List<Ingredients> getAllIngredients() throws IOException;

}
