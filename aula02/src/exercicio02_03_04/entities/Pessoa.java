package exercicio02_03_04.entities;

public class Pessoa {
    public String ID;
    public String name;
    public Integer age;
    public Double weight;
    public Double height;


    public Pessoa() {

    }

    public Pessoa(String id, String name, Integer age) {
        this.ID = id;
        this.name = name;
        this.age = age;
    }

    public Pessoa(String ID, String name, Integer age, Double weight, Double height) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
