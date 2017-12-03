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

    protected int health;
    protected int clock = 9000; // Every 2.5 minutes.
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
        this.cleanliness = cleanliness;
    }

}
