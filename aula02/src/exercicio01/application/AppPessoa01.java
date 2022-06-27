package exercicio01.application;

import exercicio01.entities.Pessoa;

public class AppPessoa01 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("1", "Paulo", 22, 80.00, 178.0);
        System.out.println("Name:" + p.name + " | Age: " + p.age + " | Weight" + p.weight + " | Height" + p.height);
    }
}
