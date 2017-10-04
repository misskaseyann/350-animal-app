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
    private LoopLoader music;

    public MenuState(Manager manager) {
        super(manager);
        music = new LoopLoader();
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {
        if (!music.isPlaying()) {
            music.load("res/sounds/menu.wav");
            music.play();
        }
        if (manager.getKeyManager().enter) {
            music.stop();
            State.setState(manager.getGame().getGameState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(manager.getMouseManager().getMouseX(), manager.getMouseManager().getMouseY(), 50, 50);
    }
}
