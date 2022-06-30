package models;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Auau");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Eat Meat");
    }
}
