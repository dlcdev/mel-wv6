package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Exemplo03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        numeros.forEach(n -> System.out.println(n + " test: " + 1));

        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n + " test: " + 1);
        });

    }

//    public boolean par(int n) {
//        return n % 2 == 0;
//    }

//    public boolean par(int n) {
//        return n % 2 == 0;
//    }

    //expressão lambda
//    n -> n % 2 == 0;
}
