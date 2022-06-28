package models;

public class CountCollectors extends Count {
    public CountCollectors(int id, String name, int age, int document) {
        super(id, name, age, document);
    }

    @Override
    public void transactionOk() {
        System.out.println("Transaction to Client Collectors ok.");
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transaction to Client Collectors ok.");
    }
}
