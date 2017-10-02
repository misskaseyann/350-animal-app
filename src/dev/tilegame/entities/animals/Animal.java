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

    public Animal (Manager manager, float x, float y) {
        super(manager, x, y);
    }


    // Getters & Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }





}
