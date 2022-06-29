package wrapper;

public class Exemplo01 {
    public static void main(String[] args) {
        int n = 10; // tipo basico

    //  Integer integer = new Integer('0'); // deprecated
        Integer integer = 10;
        int value = integer.intValue(); //autoboxing: unboxing conversion

        System.out.println(integer);
        System.out.println(value);

        int numero = Integer.parseInt("123");

        System.out.println(numero);

        Integer n1 = 100;
        Integer n2 = 100;

        System.out.println(n1 == n2);

        n1 = 200;
        n2 = 200;

        System.out.println(n1 == n2); // valor diferente
        System.out.println(n1.equals(n2));

        n1 = 300;
        n2 = 300;
        System.out.println(n1 == n2);
        
        String texto = Integer.toString(123); // converter para String
        //get class().getName() mas sdds typeof kkkk


    }
}
