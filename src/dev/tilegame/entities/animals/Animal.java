package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.entities.Entity;
/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Animal extends Entity {

    // add extra stats
    protected int health;
    protected int clock = 36000; //Ten Minutes
    protected int [] even = {7200,14400,71600,28800,36000}; //Every Two Minutes
    protected int hunger;
    protected int happiness;
    protected int cleanliness;


    protected void resetClock(){clock = 36000;}
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
    public int getHealth() { return health; }

    /**
     * @param health filler
     * **/
    public void setHealth(final int health) { this.health = health; }

    /**
     * @return filler
     * **/
    public int getHunger() { return hunger; }
    /**
     * @param hunger filler
     * **/
    public void setHunger(final int hunger) { this.hunger = hunger; }

    public int getHappiness() { return happiness; }

    public void setHappiness(int happiness) { this.happiness = happiness; }

    public int getCleanliness() { return cleanliness; }

    public void setCleanliness(int cleanliness) { this.cleanliness = cleanliness; }
}
