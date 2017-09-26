package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class TitleState extends State {

    public TitleState(Game game) {
        super(game);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.wallReg,0,0,null);
    }
}
