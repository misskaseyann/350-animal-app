package dev.tilegame.player;

import dev.tilegame.inventory.Inventory;

/**
 * @author kaseystowell
 * @version 11.14.2017
 */
public class Player {
    Inventory inventory;
    int money;


    public Player(Inventory inventory) {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
