package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.entities.Entity;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Animal extends Entity {

    // add extra stats
    /**filler.**/
    private int health;
    /**filler.**/
    private int hunger;
    /**filler.**/
    private float x;
    /**
     * @param manager filler
     * @param x filler
     * @param y filler
     **/
    public Animal(final Manager manager, final float x, final float y) {
        super(manager, x, y);
    }
    // Getters & Setters
    /**@return filler**/
    public int getHealth() {
        return health;
    }
    /**
     * @param health filler
     * **/
    public void setHealth(final int health) {
        this.health = health;
    }
    /**
     * @return filler
     * **/
    public int getHunger() {
        return hunger;
    }
    /**
     * @param hunger filler
     * **/
    public void setHunger(final int hunger) {
        this.hunger = hunger;
    }
}
