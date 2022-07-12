package com.dh.meli.calorycalculator.service;

import com.dh.meli.calorycalculator.model.Dish;
import com.dh.meli.calorycalculator.model.Ingredients;
import com.dh.meli.calorycalculator.repository.DishRepo;
import com.dh.meli.calorycalculator.repository.IngredientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl implements DishService{

    @Autowired
    private DishRepo dishRepo;

    @Autowired
    private IngredientesRepo ingredientesRepo;

    @Override
    public List<Dish> getAllDish() throws IOException {
        return dishRepo.getAllDish();
    }

    @Override
    public Dish createDish(List<Ingredients> ingredientsInputList, String dishName) throws IOException {
        final AtomicInteger count = new AtomicInteger(0);
        Dish newDish;
        double totalCalories = 0;


        totalCalories = ingredientsInputList.stream()
                .mapToDouble(c -> c.getCalories())
                .sum();

        newDish = Dish.builder()
                .id(count.incrementAndGet())
                .dishName(dishName)
                .ingredientsList(ingredientsInputList)
                .totalCalories(totalCalories)
                .build();

        newDish = dishRepo.createDish(newDish);

        return newDish;
    }
}
