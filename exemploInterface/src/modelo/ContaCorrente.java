package modelo;

public class ContaCorrente extends Conta {

    public ContaCorrente(int number) {
        super(number);
    }

    @Override
    public void sacar(int valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
        }
    }
}
