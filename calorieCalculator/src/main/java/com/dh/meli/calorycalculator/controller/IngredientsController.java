package com.dh.meli.calorycalculator.controller;


import com.dh.meli.calorycalculator.model.Ingredients;
import com.dh.meli.calorycalculator.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class IngredientsController {

    @Autowired
    private IngredientsService ingredientsService;

//    @Autowired
//    private

    @GetMapping("/ingredients")
    public ResponseEntity<java.util.List<Ingredients>> getAllIngredients() throws IOException {
        return ResponseEntity.ok(ingredientsService.getAllIngredients());
    }


}
