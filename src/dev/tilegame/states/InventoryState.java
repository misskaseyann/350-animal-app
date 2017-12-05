package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.inventory.Item;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Inventory menu for the game.
 * @author kaseystowell
 * @version 10.10.2017
 */
public class InventoryState extends State {
    /** inventory for the game. */
    Inventory inventory;

    /**
     * Inventory state constructor.
     * @param manager game class manager.
     */
    public InventoryState(final Manager manager) {
        super(manager);
        inventory = manager.getPlayer().getInventory();
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
            int size = inventory.getSize();
            Item item;
            State state;
            // Inventory 1X1
            if ((x > 38 && x < 102) && (y > 131 && y < 195)) {
                if (size > 0) {
                    item = inventory.getItemList().get(0);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 1X2
            if ((x > 151 && x < 215) && (y > 131 && y < 195)) {
                if (size > 1) {
                    item = inventory.getItemList().get(1);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 1X3
            if ((x > 260 && x < 324) && (y > 131 && y < 195)) {
                if (size > 2) {
                    item = inventory.getItemList().get(2);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 2X1
            if ((x > 38 && x < 102) && (y > 239 && y < 303)) {
                if (size > 3) {
                    item = inventory.getItemList().get(3);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 2X2
            if ((x > 151 && x < 215) && (y > 239 && y < 303)) {
                if (size > 4) {
                    item = inventory.getItemList().get(4);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 2X3
            if ((x > 260 && x < 324) && (y > 239 && y < 303)) {
                if (size > 5) {
                    item = inventory.getItemList().get(5);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 3X1
            if ((x > 38 && x < 102) && (y > 346 && y < 410)) {
                if (size > 6) {
                    item = inventory.getItemList().get(6);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 3X2
            if ((x > 151 && x < 215) && (y > 346 && y < 410)) {
                if (size > 7) {
                    item = inventory.getItemList().get(7);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 3X3
            if ((x > 260 && x < 324) && (y > 346 && y < 410)) {
                if (size > 8) {
                    item = inventory.getItemList().get(8);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 4X1
            if ((x > 38 && x < 102) && (y > 454 && y < 518)) {
                if (size > 9) {
                    item = inventory.getItemList().get(9);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 4X2
            if ((x > 151 && x < 215) && (y > 454 && y < 518)) {
                if (size > 10) {
                    item = inventory.getItemList().get(10);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Inventory 4X3
            if ((x > 260 && x < 324) && (y > 454 && y < 518)) {
                if (size > 11) {
                    item = inventory.getItemList().get(11);
                    manager.getPlayer().setCurrItem(item);
                    item.useItem(manager.getPet());
                    state = new ItemState(manager, item);
                    inventory.deleteItem(item);
                    State.setState(state);
                }
            }
            // Back Button
            if ((x > 70 && x < 294) && (y > 559 && y < 623)) {
                State.setState(State.getLastState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Renders the inventory menu.
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        g.drawImage(Assets.getMenuInventory(), 0, 0, null);
        int x = 38;
        int y = 131;
        for (int i = 0; i < inventory.getSize(); i++) {
            g.drawImage(inventory.getItemList().get(i).getImg(), x, y, null);
            if ((i + 1) % 3 == 0) {
                y += 108;
                x = 38;
            } else {
                x += 112;
            }
        }
    }

    /**
     * @return null/no world in inventory state.
     */
    public World getWorld() { return null; }
}
