package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Pause/main menu for the game.
 *
 * @author kaseystowell
 * @version 09.24.2017
 */
public class MenuState extends State {
    /**
     * game for menu state.
     */
    protected Game game = manager.getGame();

    /**
     * MenuState constructor.
     *
     * @param manager game class manager
     */
    public MenuState(final Manager manager) {
        super(manager);
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
            // Save Button
            if ((x > 70 && x < 292) && (y > 204 && y < 268)) {
                // TODO implement saving the game
                State.setState(manager.getGame().getSaveState());

            }
            // Load Button
            if ((x > 70 && x < 292) && (y > 297 && y < 340)) {
                // TODO implement loading a game
                State.setState(manager.getGame().getLoadState());
            }
            // Back Button
            if ((x > 70 && x < 292) && (y > 392 && y < 456)) {
                State.setState(State.getLastState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Render main menu screen.
     *
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        // TODO make menu prettier and add exit to title button
        g.drawImage(Assets.getPauseMenu(), 0, 0, null);

    }

    /**
     * @return null/no world in this state
     */
    public World getWorld() {
        return null;
    }
}
