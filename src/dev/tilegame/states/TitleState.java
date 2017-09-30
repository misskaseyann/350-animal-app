package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class TitleState extends State {



    public TitleState(Game game) {
        super(game);
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.wallReg,0,0,null);
    }
}
