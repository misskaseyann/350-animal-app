package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 10.10.2017
 */
public class TravelState extends State {
    //private LoopLoader music;

    public TravelState(Manager manager) {
        super(manager);
        //music = new LoopLoader();
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {
        if (manager.getKeyManager().esc) {
            State.setState(manager.getGame().getMenuState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getMenuTravel(), 0, 0, null);
    }
}