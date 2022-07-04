package application;

import entities.Client;
import entities.Item;
import util.ClientRepository;
import util.InvoiceRepository;
import util.ItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMainRepo {
    public static void main(String[] args) {

        ClientRepository clientRepository = new ClientRepository();
        InvoiceRepository invoiceRepository = new InvoiceRepository();
        ItemRepository itemRepository = new ItemRepository();

        Client c1 = new Client(11112222, "Bob", "Sancler");

        clientRepository.saveData(c1);
        clientRepository.findAllData();

    }
}
