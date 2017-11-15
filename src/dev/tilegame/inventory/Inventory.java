package dev.tilegame.inventory;

import java.util.ArrayList;

/**
 * @author kaseystowell
 * @version 11.14.2017
 */
public class Inventory {

    ArrayList<Item> itemList;

    public Inventory() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void deleteItem(Item item) {
        itemList.remove(item);
    }

}
