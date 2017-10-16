package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Inventory menu for the game.
 * @author kaseystowell
 * @version 10.10.2017
 */
public class InventoryState extends State {

    /**
     * Inventory state constructor.
     * @param manager game class manager.
     */
    public InventoryState(Manager manager) {
        super(manager);
    }

    /**
     * Checks for button clicks.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Back Button
            if ((x > 70 && x < 294) && (y > 559 && y < 623)) {
                State.setState(State.getLastState());
            }
            // TODO implement item button clicks and inventory loading.
        }
    }

    /**
     * Renders the inventory menu.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        // TODO make the inventory menu prettier
        g.drawImage(Assets.getMenuInventory(), 0, 0, null);
    }

    /**
     * @return null/no world in inventory state.
     */
    public World getWorld(){ return null; }
}
