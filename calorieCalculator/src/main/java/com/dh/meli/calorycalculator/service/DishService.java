package com.dh.meli.calorycalculator.service;

import com.dh.meli.calorycalculator.model.Dish;
import com.dh.meli.calorycalculator.model.Ingredients;

import java.io.IOException;
import java.util.List;

public interface DishService {
    public List<Dish> getAllDish() throws IOException;
    public Dish createDish(List<Ingredients> ingredientsInputList, String dishName)  throws IOException;
}
