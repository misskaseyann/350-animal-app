package dev.tilegame.states;

import dev.tilegame.Game;
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
    protected Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
