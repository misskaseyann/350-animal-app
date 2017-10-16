package dev.tilegame.gfx;

import dev.tilegame.Game;
import dev.tilegame.entities.Entity;

/**
 * Game camera that can focus on a central point.
 * @author kaseystowell
 * @version 09.25.2017
 */
public class GameCamera {

    private Game game;
    private float xOffset, yOffset;

    /**
     * GameCamera constructor.
     * @param game a game object.
     * @param xOffset x offset of camera in pixels.
     * @param yOffset y offset of camera in pixels.
     */
    public GameCamera(Game game, float xOffset, float yOffset) {
        this.game = game;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    /**
     * Centers on an entity that is 32x32 pixels large.
     * @param e entity object.
     */
    public void centerOnEntity(Entity e) {
        xOffset = (float) (e.getX() - game.getWidth() / 2.0 + 16);
        yOffset = (float) (e.getY() - game.getHeight() / 2.0 + 16);
    }

    /**
     * @return x offset in pixels.
     */
    public float getxOffset() {
        return xOffset;
    }

    /**
     * @return y offset in pixels.
     */
    public float getyOffset() {
        return yOffset;
    }

}
