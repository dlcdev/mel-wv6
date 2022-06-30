package models;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void emitSound();

    public abstract void eatAnimal();

}
