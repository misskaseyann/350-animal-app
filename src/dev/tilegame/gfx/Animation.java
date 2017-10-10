package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * @author kaseystowell
 * @version 10.03.2017
 */
public class Animation {
    /**filler.**/
    private int speed, index;
    /**filler.**/
    private long lastTime, timer;
    /**filler.**/
    private BufferedImage[] frames;
    /**filler.
     * @param frames filler
     * @param speed filler
     * **/
    public Animation(final int speed, final BufferedImage[] frames) {
        this.speed = speed;
        this.frames = frames;
        index = 0;
        timer = 0;
        lastTime = System.currentTimeMillis();
    }
    /**filler.**/
    public void tick() {
        // time in milliseconds since the last tick method called.
        timer += System.currentTimeMillis() - lastTime;
        // reset it to the time this tick method is called
        lastTime = System.currentTimeMillis();

        // once timer exceeds speed, we reset timer and increment
        // index variable of animation image
        if (timer > speed) {
            index++;
            timer = 0;
            if (index >= frames.length) {
                index = 0;
            }
        }
    }
    /**filler.
     * @return filler**/
    public BufferedImage getCurrentFrame() {
        return frames[index];
    }
}
