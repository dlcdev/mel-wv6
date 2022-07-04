package entities;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Client{

    private double purchaseTotal;
    private List<Item> listItem = new ArrayList<>();
    private Client client = new Client();

    public Invoice(double purchaseTotal, List<Item> listItem, Client client) {
        this.purchaseTotal = purchaseTotal;
        this.listItem = listItem;
        this.client = client;
    }

    public double getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(double purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public void addListItem(List<Item> listItemValues) {
        listItem.add((Item) listItemValues);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
