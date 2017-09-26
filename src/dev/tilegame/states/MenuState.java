package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class MenuState extends State {

    public MenuState(Game game) {
        super(game);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.bowl,0,0,null);
    }
}
