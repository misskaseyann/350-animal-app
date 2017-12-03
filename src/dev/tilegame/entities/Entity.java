package dev.tilegame.entities;

import java.awt.*;
import dev.tilegame.Manager;
import dev.tilegame.states.State;
import dev.tilegame.tile.Tile;

/**
 * Game entity.
 * @author kaseystowell
 * @author allisonbolen
 * @version 09.24.2017
 */
public abstract class Entity  {

    protected Manager manager;
    protected float x, y;

    /**
     * Game entity constructor.
     * @param y float value on canvas.
     * @param x float value on canvas.
     * @param manager game class manager.
     * */
    public Entity(final Manager manager, final float x, final float y)  {
        this.manager = manager;
        this.x = x;
        this.y = y;
    }

    /**
     * X location of entity on 32x32 tile based grid.
     * @return x location of entity on grid.
     */
    public int gridLocX() {
        int X = Math.round(x/32);
        return X;
    }

    /**
     * Y location of entity on 32x32 tile based grid.
     * @return y location of entity on grid.
     */
    public int gridLocY() {
        int Y = Math.round(y/32);
        return Y;
    }

    /**
     * Checks for entity collision in world.
     * @param move int value of entity movement.
     * @return false if entity will run into solid tile.
     */
    public boolean noCollide(final int move) {
        // Up to left.
        if  (move == 5) {
            int gridx = gridLocX() -  1;
            int gridy = gridLocY() -  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Up to right.
        if  (move == 6) {
            int gridx = gridLocX() +  1;
            int gridy = gridLocY() -  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Down to left.
        if (move == 7) {
            int gridx = gridLocX() -  1;
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Down to right.
        if (move == 8) {
            int gridx = gridLocX() +  1;
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Up.
        if (move ==   1) {
            int gridx = gridLocX();
            int gridy = gridLocY() -  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Down.
        if (move == 2) {
            int gridx = gridLocX();
            int gridy = gridLocY() +  1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Left.
        if  (move == 3) {
            int gridx = gridLocX() -  1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // Right.
        if  (move == 4) {
            int gridx = gridLocX() +  1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if  (Tile.getTiles()[tiles[gridx][gridy]].isSolid())
                return false;
            return true;
        }
        // No movement.
        if  (move == 0)
            return true;
        // All else return false.
        return false;
    }

    /**
     * Tick entity.
     */
    public abstract void tick();

    /**
     * Render entity on tick.
     * @param g graphics object.
     */
    public abstract void render(Graphics g);

    /**
     * @return x location of entity.
     */
    public float getX()  {
        return x;
    }

    /**
     * @param x set x location of entity.
     */
    public void setX(final float x)  {
        this.x = x;
    }

    /**
     * @return y location of entity.
     */
    public float getY()  {
        return y;
    }

    /**
     * @param y set y location of entity.
     */
    public void setY(final float y)  {
        this.y = y;
    }

}
