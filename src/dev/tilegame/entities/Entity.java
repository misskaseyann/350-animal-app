package dev.tilegame.entities;

import dev.tilegame.Manager;
import dev.tilegame.states.State;
import dev.tilegame.tile.Tile;

import java.awt.*;

/**
 * Game entity.
 *
 * @author kaseystowell
 * @author allisonbolen
 * @version 09.24.2017
 */
public abstract class Entity {
    /**
     * manager for entity.
     */
    protected Manager manager;
    /**
     * x and y positions for entity.
     */
    protected float x, y;

    /**
     * Game entity constructor.
     *
     * @param inY       float value on canvas.
     * @param inX       float value on canvas.
     * @param inManager game class manager.
     */
    public Entity(final Manager inManager, final float inX, final float inY) {
        this.manager = inManager;
        this.x = inX;
        this.y = inY;
    }

    /**
     * X location of entity on 32x32 tile based grid.
     *
     * @return x location of entity on grid.
     */
    public int gridLocX() {
        int outX = Math.round(x / 32);
        return outX;
    }

    /**
     * Y location of entity on 32x32 tile based grid.
     *
     * @return y location of entity on grid.
     */
    public int gridLocY() {
        int outY = Math.round(y / 32);
        return outY;
    }

    /**
     * Checks for entity collision in world.
     *
     * @param move int value of entity movement.
     * @return false if entity will run into solid tile.
     */
    public boolean noCollide(final int move) {
        // Up to left.
        if (move == 5) {
            int gridx = gridLocX() - 1;
            int gridy = gridLocY() - 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Up to right.
        if (move == 6) {
            int gridx = gridLocX() + 1;
            int gridy = gridLocY() - 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Down to left.
        if (move == 7) {
            int gridx = gridLocX() - 1;
            int gridy = gridLocY() + 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Down to right.
        if (move == 8) {
            int gridx = gridLocX() + 1;
            int gridy = gridLocY() + 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Up.
        if (move == 1) {
            int gridx = gridLocX();
            int gridy = gridLocY() - 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Down.
        if (move == 2) {
            int gridx = gridLocX();
            int gridy = gridLocY() + 1;
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Left.
        if (move == 3) {
            int gridx = gridLocX() - 1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // Right.
        if (move == 4) {
            int gridx = gridLocX() + 1;
            int gridy = gridLocY();
            int[][] tiles = State.getCurrentState().getWorld().getTiles();
            if (Tile.getTiles()[tiles[gridx][gridy]].isSolid()) {
                return false;
            }
            return true;
        }
        // No movement.
        if (move == 0) {
            return true;
        }
        // All else return false.
        return false;
    }

    /**
     * Tick entity.
     */
    public abstract void tick();

    /**
     * Render entity on tick.
     *
     * @param g graphics object.
     */
    public abstract void render(Graphics g);

    /**
     * @return x location of entity.
     */
    public float getX() {
        return x;
    }

    /**
     * @param inX set x location of entity.
     */
    public void setX(final float inX) {
        this.x = inX;
    }

    /**
     * @return y location of entity.
     */
    public float getY() {
        return y;
    }

    /**
     * @param inY set y location of entity.
     */
    public void setY(final float inY) {
        this.y = inY;
    }

}
