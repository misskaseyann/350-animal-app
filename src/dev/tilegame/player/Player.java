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
    /**
     * manager.
     */
    protected Manager manager;
    /**
     * inventory.
     */
    protected Inventory inventory;
    /**
     * money.
     */
    protected int money;
    /**
     * current item .
     */
    protected Item currItem;

    /**
     * Basic player constructor that instantiates an inventory,
     * money set to 100 gold, and the current held item is null.
     *
     * @param inManager game manager.
     */
    public Player(final Manager inManager) {
        this.manager = inManager;
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
     * @param inMoney the amount of money the player will have.
     */
    public void setMoney(final int inMoney) {
        if (money < 0) {
            this.money = 0;
        } else {
            this.money = inMoney;
        }
    }

    /**
     * @return player inventory.
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inInventory inventory of items for the player.
     */
    public void setInventory(final Inventory inInventory) {
        this.inventory = inInventory;
    }

    /**
     * @return the current item the player has.
     */
    public Item getCurrItem() {
        return currItem;
    }

    /**
     * @param inCurrItem current item the player will hold.
     */
    public void setCurrItem(final Item inCurrItem) {
        this.currItem = inCurrItem;
    }

}
