package utils;

import intefaces.Exibir;

public class ExibirTela implements Exibir {

    @Override
    public void show(String msg) {
        System.out.println("Na tela: " + msg);
    }
}
