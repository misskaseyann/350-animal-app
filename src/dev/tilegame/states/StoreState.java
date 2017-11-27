package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 11.26.2017
 */
public class StoreState extends State {

    private LoopLoader music;

    /**
     * StoreState constructor.
     * @param manager game class manager.
     */
    public StoreState(Manager manager) {
        super(manager);
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Back Button
            if ((x > 67 && x < 291) && (y > 560 && y < 624)) {
                State.setState(State.getLastState());
            }
        }
    }

    /**
     * Renders the shop menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getShopMenu(), 0, 0, null);
    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null;}

}