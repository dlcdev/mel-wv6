package generics;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {
        MinhaClasse<Integer> oj1 = new MinhaClasse(123);
        MinhaClasse<String> oj2 = new MinhaClasse("Texto");
        MinhaClasse<Double> bj3 = new MinhaClasse(222);

        MinhaClasse<List> obj4 = new MinhaClasse<>(List.of("value 1", 22, 222, 3344, 33344));

        List<?> lista1 = new ArrayList<>();

        System.out.println(obj4.getObj());

    }
}
