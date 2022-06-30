import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Dados.getPessoas();
        // Listar todas as pessoas
        // pessoas.stream().forEach(System.out::println);

        // Listar as 10 primeiras pessoas
        //pessoas.stream()
        //        .limit(10)
        //        .forEach(System.out::println);

        // Listar as pessoas que são do Brasil
        //pessoas.stream()
        //        .filter(n -> n.getPais().equals("Brazil"))
        //        .forEach(System.out::println);

        // Listar as pessoas do Brasil com o nome em Uppercase e suas idades
        // pessoas.stream()
        //         .filter(n -> n.getPais().equals("Brazil"))
        //         .map(p -> p.getNome().toUpperCase() + ", " + p.getIdade())
        //         .forEach(System.out::println);

        // Lista de pessoas que são do Brasil, em ordem de nome
//         pessoas.stream()
//                 .filter(p -> p.getPais().equals("Brazil"))
//                 .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
//                 .forEach(System.out::println);

        // Listar as pessoas que são do Brasil, em ordem de idade
//        pessoas.stream()
//                .filter(p -> p.getPais().equals("Brazil"))
//                .sorted()
//                .forEach(System.out::println);


        // conte quantas pessoas tem mais de 45 anos
//        long quantidade = pessoas.stream()
//                .filter(p-> p.getIdade() > 45)
//                .count();
//
//        System.out.println("Pessoas com mais de 45 anos: " + quantidade);

        // Média de idade das pessoas
        double media = pessoas.stream()
                .mapToDouble(p -> p.getIdade())
                .average().getAsDouble();

        System.out.println("Média de idade: " + media);

        // end
    }

}
