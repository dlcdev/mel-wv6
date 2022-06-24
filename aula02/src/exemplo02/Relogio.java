package exemplo02;

public class Relogio {

    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    // métodos = ações

    Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public int getHora() {
        return hora;
    }



    public void mostrarHora() {
        System.out.println(
                hora + ":" + minuto + ":" + segundo
        );
    }
}
