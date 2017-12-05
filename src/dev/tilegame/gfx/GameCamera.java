package dev.tilegame.gfx;

import dev.tilegame.Game;
import dev.tilegame.entities.Entity;

/**
 * Game camera that can focus on a central point.
 * @author kaseystowell
 * @version 09.25.2017
 */
public class GameCamera {
    /** Game for the camera. */
    private Game game;
    /** xOffset and yOffset for the game camera. */
    private float xOffset, yOffset;

    /**
     * GameCamera constructor.
     * @param inGame a game object.
     * @param xOff x offset of camera in pixels.
     * @param yOff y offset of camera in pixels.
     */
    public GameCamera(final Game inGame, final float xOff, final float yOff) {
        this.game = inGame;
        this.xOffset = xOff;
        this.yOffset = yOff;
    }

    /**
     * Centers on an entity that is 32x32 pixels large.
     * @param e entity object.
     */
    public void centerOnEntity(final Entity e) {
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
