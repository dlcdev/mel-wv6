package exercicio06.application;

import exercicio05.entities.Pessoa;
import exercicio06.entities.Pessoa06;

public class AppPessoa06 {

    public static void main(String[] args) {

        String id = "2";
        String name = "Bob";
        Integer age = 25;
        Double weight = 65.00;
        Double height = 1.67;

        Pessoa06 p1 = new Pessoa06(id, name, age, weight, height);
        System.out.println(p1);



    }
}
