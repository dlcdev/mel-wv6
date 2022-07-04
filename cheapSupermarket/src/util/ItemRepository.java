package util;

import entities.Item;

import java.util.List;

public class ItemRepository implements Repository<Item>{
    List<Item> listItems;

    @Override
    public void saveData(Item obj) {
        listItems.add(obj);
    }

    @Override
    public void deleteData(int id) {
        for (Item item: listItems) {
            if (item.getCodeProduct() == id) {
                listItems.remove(id);
            }
        }
    }

    @Override
    public List<Item> findAllData() {
        return listItems;
    }
}
