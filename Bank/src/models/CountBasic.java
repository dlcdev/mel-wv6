package models;

public class CountBasic extends Count {
    public CountBasic(int id, String name, int age, int document) {
        super(id, name, age, document);
    }

    @Override
    public void transactionOk() {
        System.out.println("Transaction to Client Basic ok.");
    }

    @Override
    public void transactionNotOk() {
        System.out.println("Transaction to Client Basic Not ok.");
    }
}
