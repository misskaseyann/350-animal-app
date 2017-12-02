package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 12.01.2017
 */
public class ItemState extends State {
    private Animation animation;

    public ItemState(Manager manager, Item item) {
        super(manager);
        animation = new Animation(300, item.getAni());
    }

    @Override
    public void tick() {
        animation.tick();
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            State.setState(manager.getGame().getGameState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(animation.getCurrentFrame(), 0, 0, null);
    }

    @Override
    public World getWorld() {
        return null;
    }
}
