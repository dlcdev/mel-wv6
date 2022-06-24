package exemplo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Digite um valor inteiro:");

        try {
            number = Integer.parseInt(sc.nextLine());
            System.out.println(number);
        } catch (InputMismatchException ex) {
            System.out.println("Input error");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Number error");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro...");
        } finally {

        }
        sc.close();
    }
}
