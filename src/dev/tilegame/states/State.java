package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class State {



    private static State currentState = null;

    public static void setState(State state) {
        currentState = state;
    }

    public static State getCurrentState() {
        return currentState;
    }

    public abstract World getWorld();

    // required methods
    protected Manager manager;

    public State(Manager manager) {
        this.manager = manager;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
