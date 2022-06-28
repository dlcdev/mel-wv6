package modelos;

import intefaces.Exibir;

public class Circulo extends FiguraGeometrica {

    public Circulo(Exibir exibir) {
        super(exibir);
    }

    @Override
    public void posicao() {
        System.out.println(getX() + ", " + getY());

    }
}
