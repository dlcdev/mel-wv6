package modelo;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int number, int limite) {
        super(number);
        this.limite = limite;
    }

    @Override
    public void sacar(int valor) {
        super.sacar(valor);
    }
}
