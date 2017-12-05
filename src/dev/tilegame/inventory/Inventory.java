package dev.tilegame.inventory;

import dev.tilegame.Manager;

import java.util.ArrayList;

/**
 * Inventory class.
 *
 * @author kaseystowell
 * @version 11.14.2017
 */
public class Inventory {

    ArrayList<Item> itemList;
    Manager manager;

    /**
     * Creates the inventory list.
     */
    public Inventory(Manager manager) {
        this.manager = manager;
        itemList = new ArrayList<>();
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item item to be added.
     * @return true if the item was added, false if it could not be added.
     */
    public boolean addItem(Item item) {
        if (itemList.size() < 12) {
            itemList.add(item);
            return true;
        }
        return false;
    }

    /**
     * Deletes an item from the inventory.
     *
     * @param item deletes the given item.
     */
    public void deleteItem(Item item) {
        itemList.get(itemList.indexOf(item)).useItem(manager.getPet());
        itemList.remove(item);
    }

    /**
     * @return inventory list.
     */
    public ArrayList<Item> getItemList() {
        return itemList;
    }

    /**
     * Set the inventory list.
     *
     * @param itemList inventory array list.
     */
    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    /**
     * @return size of the inventory.
     */
    public int getSize() {
        return itemList.size();
    }

    public String getListNames() {
        StringBuffer buf = new StringBuffer();
        for (Item item : itemList) {
            buf.append(item.getName() + ",");
        }
        return buf.toString();
    }

}
