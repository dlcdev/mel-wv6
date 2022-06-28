package util;

import models.Count;

public class PaymentService implements Transaction{
    @Override
    public void transaction(Count conta) {
        System.out.println("Execute payment services: X");
    }
}
