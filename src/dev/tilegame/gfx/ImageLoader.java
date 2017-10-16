package dev.tilegame.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Helper class that reads a path to an image and returns a buffered image.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class ImageLoader {

    /**
     * @param path string path to image.
     * @return buffered image.
     */
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
