package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Title screen state.
 *
 * @author kaseystowell
 * @version 09.24.2017
 */
public class TitleState extends State {
    /**
     * animation.
     */
    private Animation titleAni;
    /**
     * music.
     */
    private LoopLoader music;

    /**
     * TitleState constructor.
     * Sets up the tile states.
     *
     * @param manager game class manager.
     */
    public TitleState(final Manager manager) {
        super(manager);
        titleAni = new Animation(300, Assets.getTitleImg());
        //initialize music
        music = manager.getLoopLoader();
        //manager.setLoopLoader(music);
    }

    /**
     * getWorld returns the world.
     *
     * @return null
     */
    public World getWorld() {
        return null;
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        titleAni.tick();
        if (!music.isPlaying()) {
            music.load("res/sounds/title.wav");
            music.play();
        }
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // New Button
            if ((x > 64 && x < 288) && (y > 451 && y < 515)) {
                music.stop();
                State.setState(manager.getGame().getGameState());
            }
            // Load Button
            if ((x > 64 && x < 288) && (y > 545 && y < 609)) {
                // TODO load functionality
                State.setLastState(State.getCurrentState());
                State.setState(manager.getGame().getLoadState());

            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Render the title screen.
     *
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        g.drawImage(titleAni.getCurrentFrame(), 0, 0, null);
    }

}
