package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Creates a sprite sheet and allows creation of tiles.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class SpriteSheet {

    /**
     * Sprite sheet image.
     */
    private final BufferedImage sheet;

    /**
     * SpriteSheet constructor.
     * @param inSheet buffered image.e
     */
    public SpriteSheet(final BufferedImage inSheet) {
        this.sheet = inSheet;
    }

    /**
     * Crops a sprite sheeet.
     * @param x starting point of crop in pixels in x direction.
     * @param y starting point of crop in pixels in y direction.
     * @param width width of image in pixels.
     * @param height height of image in pixels.
     * @return buffered image of crop.
     */
    public BufferedImage crop(final int x, final int y, final int width, final int height) {
        return sheet.getSubimage(x, y, width, height);
    }

}
