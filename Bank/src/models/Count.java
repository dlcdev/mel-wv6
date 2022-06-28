package models;

public abstract class Count {
    private int id;
    private String name;
    private int age;
    private int document;
    private double balance;

    public Count(int id, String name, int age, int document) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.document = document;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDocument() {
        return document;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void transactionOk();

    public abstract void transactionNotOk();



}
