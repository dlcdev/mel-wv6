package util;

import entities.Client;
import entities.Invoice;

import java.util.List;

public class InvoiceRepository implements Repository <Invoice>{

    List<Invoice> listInvoices;
    @Override
    public void saveData(Invoice obj) {
        listInvoices.add(obj);
    }

    @Override
    public void deleteData(int id) {
        for (Invoice invoice : listInvoices){
            if (invoice.getId() == id) {
                listInvoices.remove(id);
            }
        }

    }

    @Override
    public List<Invoice> findAllData() {
        return listInvoices;
    }
}
