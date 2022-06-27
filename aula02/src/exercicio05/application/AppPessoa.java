package exercicio05.application;

import exercicio05.entities.Pessoa;

import java.util.Locale;

public class AppPessoa {
    public static void main(String[] args) {

        String id = "1";
        String name = "Bob";
        Integer age = 25;
        Double weight = 1.67;
        Double height = 99.00;

        Pessoa p1 = new Pessoa(id, name, age, weight, height);
        System.out.println(p1);

    }
}
