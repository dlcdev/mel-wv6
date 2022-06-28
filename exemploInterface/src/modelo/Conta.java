package modelo;

import util.BancoDeDados;

public abstract class Conta {

    private int number;
    private double saldo;

    public Conta(int number) {
        this.number = number;
    }

    public void depositar(int valor) {
        saldo += valor;
    }

    public void sacar(int valor) {
        saldo -= valor;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void gravar(BancoDeDados banco){
        banco.gravar(this);
    }


}
