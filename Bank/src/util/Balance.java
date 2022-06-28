package util;

import models.Count;

public class Balance implements Transaction{
    @Override
    public void transaction(Count conta) {
        System.out.println("Execute balance: " +  conta.getBalance());
    }
}
