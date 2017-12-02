package dev.tilegame.player;

import dev.tilegame.Manager;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.inventory.Item;

/**
 * @author kaseystowell
 * @version 11.14.2017
 */
public class Player {

    Manager manager;
    Inventory inventory;
    int money;
    Item currItem;

    public Player(Manager manager) {
        this.manager = manager;
        inventory = new Inventory(manager);
        money = 100;
        currItem = null;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0)
            this.money = 0;
        else
            this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Item getCurrItem() {
        return currItem;
    }

    public void setCurrItem(Item currItem) {
        this.currItem = currItem;
    }
}
