package utils;

import models.Animal;

public class Meat implements Food {


    @Override
    public void eat(Animal animal) {
        animal.eatAnimal();
    }
}
