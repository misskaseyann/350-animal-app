package dev.tilegame.inventory;

/**
 * @author kaseystowell
 * @version 11.14.2017
 */
public interface Item {
    public boolean sufficentFunds(int userMoney);
    public void quantity();
    public boolean isEdible();
}
