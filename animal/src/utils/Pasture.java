package utils;

import models.Animal;

public class Pasture implements Food{
    @Override
    public void eat(Animal animal) {
        animal.eatAnimal();
    }
}
