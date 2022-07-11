package com.dh.meli.calorycalculator.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dish {
    private long id;
    private String dishName;
    private List<Ingredients> ingredientsList;
    private Double  totalCalories;
}
