package dev.tilegame.entities.animals;

import dev.tilegame.Game;
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

    public Animal(Game game, float x, float y) {
        super(game, x, y);
        health = 10;
    }

    // Getters & Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }





}
