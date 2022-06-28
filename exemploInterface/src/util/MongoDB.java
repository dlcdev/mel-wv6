package util;

import modelo.Conta;

public class MongoDB implements BancoDeDados {

    @Override
    public void gravar(Conta conta) {
        System.out.printf("Gravando no BD MongoDB a conta: %d\n", conta.getNumber());
    }

}
