package dev.tilegame.player;

import dev.tilegame.Manager;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.inventory.Item;

/**
 * Player of the game.
 *
 * @author kaseystowell
 * @version 11.14.2017
 */
public class Player {

    Inventory inventory;
    int money;
    Item currItem;

    /**
     * Basic player constructor that instantiates an inventory,
     * money set to 100 gold, and the current held item is null.
     * @param manager game manager.
     */
    public Player(Manager manager) {
        inventory = new Inventory(manager);
        money = 100;
        currItem = null;
    }

    /**
     * @return amount of money the player has.
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the amount of money the player will have.
     */
    public void setMoney(int money) {
        if (money < 0)
            this.money = 0;
        else
            this.money = money;
    }

    /**
     * @return player inventory.
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory inventory of items for the player.
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the current item the player has.
     */
    public Item getCurrItem() {
        return currItem;
    }

    /**
     * @param currItem current item the player will hold.
     */
    public void setCurrItem(Item currItem) {
        this.currItem = currItem;
    }

}
