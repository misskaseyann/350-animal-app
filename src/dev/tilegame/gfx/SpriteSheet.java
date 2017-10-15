package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Creates a sprite sheet and allows creation of tiles.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class SpriteSheet {

    private BufferedImage sheet;

    /**
     * SpriteSheet constructor.
     * @param sheet buffered image.e
     */
    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    /**
     * Crops a sprite sheeet.
     * @param x starting point of crop in pixels in x direction.
     * @param y starting point of crop in pixels in y direction.
     * @param width width of image in pixels.
     * @param height height of image in pixels.
     * @return buffered image of crop.
     */
    public BufferedImage crop(int x, int y, int width, int height) {
        return sheet.getSubimage(x,y,width,height);
    }

}
