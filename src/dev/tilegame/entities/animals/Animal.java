package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.Entity;
import dev.tilegame.utils.Utils;

import java.util.ArrayList;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Animal extends Entity {

    // add extra stats
    protected int health;
    protected int clock = 36000; //Ten Minutes
    protected int [] even = {7200 , 14400, 71600 , 28800 , 36000}; //Every Two Minutes
    protected int hunger;
    protected int happiness;
    protected int cleanliness;

    public Animal (Manager manager, float x, float y) {
        super(manager, x, y);
    }

    protected void resetClock(){clock = 36000;}

    // Getters & Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() { return happiness; }

    public void setHappiness(int happiness) { this.happiness = happiness; }

    public int getCleanliness() { return cleanliness; }

    public void setCleanliness(int cleanliness) { this.cleanliness = cleanliness; }
}
