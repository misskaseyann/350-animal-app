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
    /**currentState holds the State the user is currently at.*/
    private static State currentState = null;
    /**lastState holds the previous State the user was at.*/
    private static State lastState = null;
    /**manager is the Game's manager.*/
    protected Manager manager;

    /**
     * State constructor.
     * Sets up the class manager.
     * @param inManager class mananger.
     */
    public State(final Manager inManager) {
        this.manager = inManager;
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
    public static void setState(final State state) {
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
    public static State getLastState() {
        return lastState; }

    /**
     * @param state last launched game state.
     */
    public static void setLastState(final State state) {
        lastState = state; }

    /**
     * @return current world rendered on screen.
     */
    public abstract World getWorld();

}
