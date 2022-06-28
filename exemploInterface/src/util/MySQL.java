package util;

import modelo.Conta;

public class MySQL implements BancoDeDados {

    @Override
    public void gravar(Conta conta) {
        System.out.printf("Gravando no BD MySQl a conta: %d\n", conta.getNumber());
    }

}
