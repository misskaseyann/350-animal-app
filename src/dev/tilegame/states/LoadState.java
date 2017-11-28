package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Pause/main menu for the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class LoadState extends State {

    /**
     * MenuState constructor.
     * @param manager game class manager
     */
    public LoadState(Manager manager) {
        super(manager);
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?

    }

    /**
     * Render main menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        // TODO make menu prettier and add exit to title button

    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null; }
}
