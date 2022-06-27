package application;

import java.util.Scanner;

public class PracticeExcept {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Number 1:");
        int a = sc.nextInt();
        System.out.println("Number 2: ");
        int b = sc.nextInt();

        try {
            int result = b/a;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Number cannot be divided by zero");
        } catch (IllegalArgumentException ex){
            System.out.println("Cannot be divided by zero");;
        }

        sc.close();
    }
}
