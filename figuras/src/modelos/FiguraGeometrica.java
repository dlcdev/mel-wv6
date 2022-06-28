package modelos;

import intefaces.Exibir;

public abstract class FiguraGeometrica {
    private int x, y;

    public FiguraGeometrica(Exibir exibir) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void posicao();
}
