package application;

import entities.Client;

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

        System.out.println("Finder the client with ID");
        System.out.print("Enter the number id: ");
        int findNumber = sc.nextInt();
        listClient.stream()
                .forEach(r -> {
                    if (r.getId() == findNumber) {
                        System.out.println(r);
                    } else {
                        System.out.println("Was not found");
                    }
                });

        sc.close();
    }
}
