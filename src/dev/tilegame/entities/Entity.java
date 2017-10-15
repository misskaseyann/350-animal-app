package dev.tilegame.entities;

import dev.tilegame.Game;
import java.awt.*;
import java.util.ArrayList;
import dev.tilegame.Manager;
import dev.tilegame.input.KeyManager;
import dev.tilegame.states.State;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;
/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Entity  {

    /**
     * filler.
     * */
    protected Manager manager;
    /**
     * filler.
     * */
    protected float x, y;

    /**
     * filler.
     * @param y filler
     * @param x filler
     * @param manager filler
     * */
    public Entity(final Manager manager, final float x, final float y)  {
        this.manager = manager;
        this.x = x;
        this.y = y;
    }


    /**
     * filler.
     * */
    public int gridLocX() {
        int X = Math.round(x/32);
        return X;
    };

    /**
     * filler.
     * */
    public int gridLocY() {
        int Y = Math.round(y/32);
        return Y;
    };



    /**
     * filler.
     * @param move filler
     * */
    public boolean noCollide(final int move) {
        if  (move == 5) {  //Up to left
            int gridx = gridLocX() -  1;
            int gridy = gridLocY() -  1;
            //int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 6) {  //Up to right
            int gridx = gridLocX() +  1;
            int gridy = gridLocY() -  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 7) {  //Down to left
            int gridx = gridLocX() -  1;
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 8) {  //Down to right
            int gridx = gridLocX() +  1;
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move ==   1) {  //Up
            int gridx = gridLocX();
            int gridy = gridLocY() -  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 2) {  //Down
            int gridx = gridLocX();
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 3) {  //Left
            int gridx = gridLocX() -  1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 4) {  //Right
            int gridx = gridLocX() +  1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        if  (move == 0) {  return true;}

        return false;
    }
    /**
     * filler.
     * */
    public abstract void tick();

    /**
     * filler.
     * */
    public abstract void render(Graphics g);

    /**
     * filler.
     * */
    public float getX()  {
        return x;
    }

    /**
     * filler.
     * @param x filler
     * */
    public void setX(final float x)  {
        this.x = x;
    }

    /**
     * filler.
     * */
    public float getY()  {
        return y;
    }

    /**
     * filler.
     * @param y filler
     * */
    public void setY(final float y)  {
        this.y = y;
    }


}
