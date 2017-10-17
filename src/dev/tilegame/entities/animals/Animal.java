package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.entities.Entity;
/**
 * Animal entity.
 * @author kaseystowell
 * @author brendannahed
 * @version 09.24.2017
 */
public abstract class Animal extends Entity {

    // TODO add more stats?
    protected int health;
    //protected int clock = 36000; //Ten Minutes
    protected int clock = 9000; // Every 2.5 minutes.
    //protected int [] even = {7200 , 14400, 71600 , 28800 , 36000}; //Every Two Minutes
    protected int [] even = {1800, 3600, 5400, 7200, 9000}; // Every 30 seconds.
    protected int hunger;
    protected int happiness;
    protected int cleanliness;


    /**
     * Reset clock to 2.5 minutes.
     */
    protected void resetClock(){ clock = 9000; }

    /**
     * Animal constructor.
     * @param manager game class manager.
     * @param x float x value on canvas.
     * @param y float y value on canvas.
     */
    public Animal(final Manager manager, final float x, final float y) { super(manager, x, y); }

    /**
     * @return health of animal.
     */
    public int getHealth() { return health; }

    /**
     * @param health health of animal value from 0-6.
     */
    public void setHealth(int health) {
        // TODO error check for a value less than 0 or more than 6
        this.health = health;
    }

    /**
     * @return hunger of animal.
     */
    public int getHunger() { return hunger; }

    /**
     * @param hunger hunger of animal value from 0-6.
     */
    public void setHunger(final int hunger) {
        // TODO error check for a value less than 0 or more than 6
        this.hunger = hunger;
    }

    /**
     * @return happiness of animal.
     */
    public int getHappiness() { return happiness; }

    /**
     * @param happiness happiness of animal value from 0-6.
     */
    public void setHappiness(int happiness) {
        // TODO error check for a value less than 0 or more than 6
        this.happiness = happiness;
    }

    /**
     * @return cleanliness of animal.
     */
    public int getCleanliness() { return cleanliness; }

    /**
     * @param cleanliness cleanliness of animal value from 0-6.
     */
    public void setCleanliness(int cleanliness) {
        // TODO error check for a value less than 0 or more than 6
        this.cleanliness = cleanliness;
    }

}
