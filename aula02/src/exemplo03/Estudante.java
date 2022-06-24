package exemplo03;

public class Estudante extends Pessoa {

    private String curso;

    public Estudante(String name, String curso) {
        super(name);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("\nExtudante: ");
        sb.append("\nNome: " + nome);
        sb.append("\nCurso: " + curso);
        return sb.toString();

    }


}
