package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Abstract State class that helps manage each of the game's states.
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class State {

    private static State currentState = null;
    private static State lastState = null;
    protected Manager manager;

    /**
     * State constructor.
     * Sets up the class manager.
     * @param manager class mananger.
     */
    public State(Manager manager) {
        this.manager = manager;
    }

    /**
     * Tick the game.
     */
    public abstract void tick();

    /**
     * Render any graphics on the screen.
     * @param g graphics object.
     */
    public abstract void render(Graphics g);

    /**
     * @param state current game state.
     */
    public static void setState(State state) {
        currentState = state;
    }

    /**
     * @return current game state.
     */
    public static State getCurrentState() {
        return currentState;
    }

    /**
     * @return last launched game state.
     */
    public static State getLastState() { return lastState; }

    /**
     * @param state last launched game state.
     */
    public static void setLastState(State state) { lastState = state; }

    /**
     * @return current world rendered on screen.
     */
    public abstract World getWorld();

}
