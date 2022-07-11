package com.dh.meli.calorycalculator.service;

import com.dh.meli.calorycalculator.model.Ingredients;
import com.dh.meli.calorycalculator.repository.IngredientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    @Autowired
    private IngredientesRepo ingredientesRepo;

    @Override
    public List<Ingredients> getAllIngredients() throws IOException {
        return ingredientesRepo.getAllIngredients();
    }


}
