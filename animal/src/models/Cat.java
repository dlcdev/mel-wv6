package models;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Miau");
    }
}
