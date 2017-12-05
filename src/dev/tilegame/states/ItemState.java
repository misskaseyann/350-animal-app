package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.inventory.Item;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Item state.
 *
 * @author kaseystowell
 * @version 12.01.2017
 */
public class ItemState extends State {
    /**animation for the item state*/
    private Animation animation;

    /**
     * Basic constructor for an item object.
     * @param manager game manager.
     * @param item item being viewed in the state.
     */
    public ItemState(final Manager manager, final Item item) {
        super(manager);
        animation = new Animation(300, item.getAni());
    }

    /**
     * Check for mouse clicks.
     */
    @Override
    public void tick() {
        animation.tick();
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Move out of the item state.
            State.setState(State.getLastState());
        }
    }

    /**
     * Render item animation.
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        g.drawImage(animation.getCurrentFrame(), 0, 0, null);
    }

    /**
     * @return game world/null because there is no world in this state.
     */
    @Override
    public World getWorld() {
        return null;
    }
}
