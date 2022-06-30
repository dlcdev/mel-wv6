package models;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Muu");
    }

    @Override
    public void eatAnimal() {
        System.out.println("Eat pasture");
    }
}
