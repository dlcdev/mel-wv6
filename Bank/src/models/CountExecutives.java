package models;

public class CountExecutives extends Count {


    public CountExecutives(int id, String name, int age, int document) {
        super(id, name, age, document);
    }

    @Override
    public void transactionOk() {
        System.out.println("Transaction to Client Executive ok.");
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transaction to Client Executive not ok!");
    }

}
