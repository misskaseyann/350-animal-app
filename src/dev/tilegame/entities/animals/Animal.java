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
    /** health for the pet. */
    protected int health;
    /** clock for pet. */
    protected int clock = 9000; // Every 2.5 minutes.
    /** calculation for movement. */
    protected int[] even = {1800, 3600, 5400, 7200, 9000}; // Every 30 seconds.
    /** pet hunger. */
    protected int hunger;
    /** pet happiness. */
    protected int happiness;
    /** pet cleanliness. */
    protected int cleanliness;

    /**
     * Reset clock to 2.5 minutes.
     */
    protected void resetClock() {
        clock = 9000;
    }

    /**
     * Animal constructor.
     * @param manager game class manager.
     * @param x float x value on canvas.
     * @param y float y value on canvas.
     */
    public Animal(final Manager manager, final float x, final float y) {
        super(manager, x, y);
    }

    /**
     * @return health of animal.
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param inHealth health of animal value from 0-6.
     */
    public void setHealth(final int inHealth) {

        this.health = inHealth;
    }

    /**
     * @return hunger of animal.
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * @param inHunger hunger of animal value from 0-6.
     */
    public void setHunger(final int inHunger) {
        this.hunger = inHunger;
    }

    /**
     * @return happiness of animal.
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * @param inHappiness happiness of animal value from 0-6.
     */
    public void setHappiness(final int inHappiness) {
        this.happiness = inHappiness;
    }

    /**
     * @return cleanliness of animal.
     */
    public int getCleanliness() {
        return cleanliness;
    }

    /**
     * @param inCleanliness cleanliness of animal value from 0-6.
     */
    public void setCleanliness(final int inCleanliness) {
        this.cleanliness = inCleanliness;
    }

}
