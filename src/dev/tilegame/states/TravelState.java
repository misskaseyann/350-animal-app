package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Travel menu.
 * Options include: Home, park, vet, shop, and back.
 * @author kaseystowell
 * @version 10.10.2017
 */
public class TravelState extends State {

    private LoopLoader music;

    /**
     * TravelState constructor.
     * Sets up music to current loop loader.
     * @param manager game class manager.
     */
    public TravelState(Manager manager) {
        super(manager);
        music = manager.getLoopLoader();
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Home Button
            if ((x > 70 && x < 294) && (y > 126 && y < 190)) {
                music.stop();
                manager.getPet().setY(manager.getGame().getGameState().getWorld().getSpawnY() * 32);
                manager.getPet().setX(manager.getGame().getGameState().getWorld().getSpawnX() * 32);
                State.setState(manager.getGame().getGameState());
            }
            // Park Button
            if ((x > 70 && x < 294) && (y > 227 && y < 291)) {
                manager.getPet().setY(manager.getGame().getParkState().getWorld().getSpawnY() * 32);
                manager.getPet().setX(manager.getGame().getParkState().getWorld().getSpawnX() * 32);
                music.stop();
                State.setState(manager.getGame().getParkState());
            }
            // Vet Button
            if ((x > 70 && x < 294) && (y > 327 && y < 389)) {
                State.setState(manager.getGame().getVetState());
            }
            // Shop Button
            if ((x > 70 && x < 294) && (y > 424 && y < 489)) {
                State.setState(manager.getGame().getStoreState());
            }
            // Back Button
            if ((x > 70 && x < 294) && (y > 524 && y < 588)) {
                State.setState(State.getLastState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Renders the travel menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        // TODO make a prettier menu
        g.drawImage(Assets.getMenuTravel(), 0, 0, null);
    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null;}

}