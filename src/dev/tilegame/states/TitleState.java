package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class TitleState extends State {



    public TitleState(Manager manager) {
        super(manager);
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {
        if (manager.getKeyManager().enter)
            State.setState(manager.getGame().getGameState());
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(manager.getMouseManager().getMouseX(), manager.getMouseManager().getMouseY(), 10, 10);
    }
}
