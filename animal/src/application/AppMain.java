package application;

import models.Animal;
import models.Cat;
import models.Cow;
import models.Dog;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("Dog");
        Animal dog = new Dog("Dudu");
        dog.emitSound();
        dog.eatAnimal();

        System.out.println();
        System.out.println("Cow");

        Animal cow = new Cow("Mimosa");
        cow.emitSound();
        cow.eatAnimal();

        System.out.println();
        System.out.println("Cat");
        Animal cat = new Cat("Felix");
        cat.emitSound();
        cat.eatAnimal();

    }
}
