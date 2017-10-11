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
        if (manager.getKeyManager().enter) {
            State.setState(manager.getGame().getGameState());
        }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getPauseMenu(), 0, 0, null);
    }
}
