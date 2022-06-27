package exercicio02_03_04.application;

import exercicio02_03_04.entities.Pessoa;

public class AppPessoa2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("33", "Paulo", 22);
        Pessoa p3 = new Pessoa("", "Andre", 33, 89.00, 1.89);

        System.out.println("P1" + p1);
        System.out.println("P2: ID: " + p2.ID + " | Name: " + p2.name + " | Age: " + p2.age);

        System.out.println(
                "P3: ID: " + p2.ID
                        + " | Name: " + p3.name
                        + " | Age: " + p3.age
                        + " | Weight: " + p3.weight
                        + " | Height: " + p3.height
        );
    }
}
