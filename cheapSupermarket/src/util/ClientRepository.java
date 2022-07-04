package util;

import entities.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements Repository<Client> {

    List<Client> listClients;
    public ClientRepository() {
        this.listClients = new ArrayList<>();
    }

    @Override
    public void saveData(Client client) {
        listClients.add(client);
    }

    @Override
    public void deleteData(int id) {

        for (Client client : listClients){
            if (client.getId() == id) {
                listClients.remove(id);
            }
        }

    }


    @Override
    public List<Client> findAllData() {
        return listClients;
    }


}
