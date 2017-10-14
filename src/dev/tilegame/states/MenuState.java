package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class MenuState extends State {
    //private LoopLoader music;

    public MenuState(Manager manager) {
        super(manager);
        //music = new LoopLoader();
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {
        /*if (manager.getKeyManager().enter) {
            State.setState(manager.getGame().getGameState());
        }*/
        if (manager.getMouseManager().getLeftPress()) {
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            if ((x > 70 && x < 294) && (y > 153 && y < 217)) {
                // save function here
            }
            if ((x > 83 && x < 280) && (y > 276 && y < 340)) {
                State.setState(manager.getGame().getTitleState());
            }
            if ((x > 16 && x < 346) && (y > 397 && y < 461)) {
                State.setState(manager.getGame().getGameState());
            }
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getPauseMenu(), 0, 0, null);
    }
}
