package application;

import entities.NotPerishable;
import entities.Perishable;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distributor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> listProducts = new ArrayList();

        System.out.print("Quantity products: ");
        int quantityProduct = sc.nextInt();

        for(int i=1; i <= quantityProduct; i++){
            sc.nextLine();
            System.out.println("Product #: " + i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price:");
            double price = sc.nextDouble();
            System.out.println();



            System.out.println("Which category: 1 - Perishable | 2 - Not Perishable");
            char choice = sc.next().charAt(0);

            if (choice == '1') {
                System.out.print("Days to expiration:");
                int daysToExpiration = sc.nextInt();
                listProducts.add(new Perishable(name, price, daysToExpiration));
            } else if (choice == '2') {
                System.out.println("Type");
                String type = sc.nextLine();
                listProducts.add(new NotPerishable(name, price, type));
            }
        }

        for (Product product: listProducts) {
            System.out.println("-- List of Products--");

            System.out.print("Quantity " + product.getName() + ": ");
            int quantity = sc.nextInt();
            System.out.println(product + " | total: " + product.calculate(quantity));

        }


        sc.close();
    }
}
