package models;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Miau");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Eat Meat");
    }
}
