package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        Stream<Integer> stream = lista.stream();
//        stream.forEach(n -> System.out.println(n));
//        lista.stream().forEach(n -> System.out.println(n));
//        lista.stream().map(n -> n * 2);
//        lista.stream().forEach(n -> System.out.println(n + ""));

        List<Integer> listaAlterada = lista.stream()
                .filter( n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        long countar = lista.stream()
                .filter( n -> n % 2 == 0)
                .count();

//        lista.forEach(n -> System.out.println(n + " "));
        listaAlterada.forEach(n -> System.out.print(" - " + n));

        lista.forEach(System.out::print);

    }
}
