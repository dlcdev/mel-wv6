package com.dh.meli.calorycalculator.controller;

import com.dh.meli.calorycalculator.model.Dish;
import com.dh.meli.calorycalculator.model.Ingredients;
import com.dh.meli.calorycalculator.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("/dish")
    public ResponseEntity<java.util.List<Dish>> getAllDish() throws IOException {
        return ResponseEntity.ok(dishService.getAllDish());
    }

    @PostMapping("/dish-create")
    public ResponseEntity<Dish> createDish(@RequestBody java.util.List<Ingredients> ingredientsList, String dishName) throws IOException {
        return new ResponseEntity<>(dishService.createDish(ingredientsList, dishName), HttpStatus.OK);

    }


}
