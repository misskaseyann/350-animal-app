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

    /**
     * item list containingthe items in the inventory.
     */
    protected ArrayList<Item> itemList;
    /**
     * the manager for the inventory.
     */
    protected Manager manager;

    /**
     * Creates the inventory list.
     *
     * @param inManager the manager sent in
     */
    public Inventory(final Manager inManager) {
        this.manager = inManager;
        itemList = new ArrayList<>();
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item item to be added.
     * @return true if the item was added, false if it could not be added.
     */
    public boolean addItem(final Item item) {
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
    public void deleteItem(final Item item) {
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
     * @param inItemList inventory array list.
     */
    public void setItemList(final ArrayList<Item> inItemList) {
        this.itemList = inItemList;
    }

    /**
     * @return size of the inventory.
     */
    public int getSize() {
        return itemList.size();
    }

    /**
     * lists the names of the items in item list.
     *
     * @return the list of names of items
     */
    public String getListNames() {
        StringBuffer buf = new StringBuffer();
        for (Item item : itemList) {
            buf.append(item.getName() + ",");
        }
        return buf.toString();
    }

    /**
     * get manager for the inventory.
     *
     * @return the manager
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * set manager for the inventory.
     *
     * @param inManager the manager sent in
     */
    public void setManager(final Manager inManager) {
        this.manager = inManager;
    }
}
