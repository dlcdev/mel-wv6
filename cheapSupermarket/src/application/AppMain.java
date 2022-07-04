package application;

import entities.Client;
import entities.Invoice;
import entities.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Client> listClient = new ArrayList<>();

        listClient.add(new Client(11112222, "Bob", "Sancler"));
        listClient.add(new Client(22223333, "Liz", "Lispectro"));
        listClient.add(new Client(333333, "Ander", "Boy"));



        for (Client client : listClient) {
            System.out.println(client);

        }

        listClient.remove(2);

        System.out.println("Remove the user in position 2.");
        for (Client client : listClient) {
            System.out.println(client);

        }

//        System.out.println("Finder the client with ID");
//        System.out.print("Enter the number id: ");
//        int findNumber = sc.nextInt();
//        listClient.stream()
//                .forEach(r -> {
//                    if (r.getId() == findNumber) {
//                        System.out.println(r);
//                    } else {
//                        System.out.println("Was not found");
//                    }
//                });
//

        List<Item> items = new ArrayList<>();
        items.add(new Item(1111, "Leite", 2, 8.00));
        items.add(new Item(1112, "Biscoito", 3, 5.00));
        items.add(new Item(1113, "Iogurte", 5, 4.00));


        double purchaseTotal = items.stream()
                .mapToDouble(p -> p.getCostProduct() * p.getQuantityProduct())
                .sum();


//        Invoice invoice = new Invoice(purchaseTotal, items, (Client) listClient);


        sc.close();
    }
}
