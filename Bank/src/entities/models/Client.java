package entities.models;

public class Client {
    private int id;
    private String name;
    private int age;
    private int document;
    private double balance;

    public Client(int id, String name, int age, int document) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.document = document;
        this.balance = 0.00;
    }




}
