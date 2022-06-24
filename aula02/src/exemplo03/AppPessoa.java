package exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        String nome = "Armando";
        String curso = "Sistemas de Informação";
        Estudante e1 = new Estudante(nome, curso);

        System.out.println(e1);

    }
}
