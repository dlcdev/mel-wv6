package util;

import models.Count;

public class Transfer implements Transaction{
    @Override
    public void transaction(Count conta) {
        System.out.println("Execute Transfer: " +  conta.getName());
    }
}
