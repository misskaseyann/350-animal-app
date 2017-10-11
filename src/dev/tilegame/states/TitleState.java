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
public class TitleState extends State {

    private LoopLoader music;
    private boolean inState = false;

    public TitleState(Manager manager) {
        super(manager);
        //initialize music
        music = new LoopLoader();
    }

    public World getWorld(){ return null;}

    @Override
    public void tick() {
        if (!music.isPlaying()) {
            music.load("res/sounds/title.wav");
            music.play();
        }
        if (manager.getKeyManager().enter) {
            music.stop();
            State.setState(manager.getGame().getGameState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getTitleImg(), 0, 0, null);
    }

    public boolean isInState() {
        return inState;
    }

    public void setInState(boolean inState) {
        this.inState = inState;
    }

}
