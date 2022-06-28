package util;

import models.Count;

public class WithDrawMoney implements Transaction {
    @Override
    public void transaction(Count conta) {
        System.out.println("Execute withdraw money: " + conta.getBalance());
    }
}
