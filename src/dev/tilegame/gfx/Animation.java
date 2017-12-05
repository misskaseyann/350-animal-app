package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Animation graphics.
 *
 * @author kaseystowell
 * @version 10.03.2017
 */
public class Animation {
    /**
     * speed and index for animation.
     */
    private int speed, index;
    /**
     * lastTime and timer for animation.
     */
    private long lastTime, timer;
    /**
     * buffered image frames for animation.
     */
    private BufferedImage[] frames;

    /**
     * Animation constructor.
     *
     * @param inSpeed  speed of animation.
     * @param inFrames animation frames.
     */
    public Animation(final int inSpeed, final BufferedImage[] inFrames) {
        this.speed = inSpeed;
        this.frames = inFrames;
        index = 0;
        timer = 0;
        // Set last time to current system time in milliseconds.
        lastTime = System.currentTimeMillis();
    }

    /**
     * Tracks time passed in milliseconds.
     * Sets animation frame based on speed of animation.
     */
    public void tick() {
        // Time in milliseconds since the last tick method called.
        timer += System.currentTimeMillis() - lastTime;
        // Reset to the time this tick method is called.
        lastTime = System.currentTimeMillis();
        // Once timer exceeds speed, we reset timer and increment index variable of animation image.
        if (timer > speed) {
            index++;
            timer = 0;
            if (index >= frames.length) {
                index = 0;
            }
        }
    }

    /**
     * @return current animation image.
     */
    public BufferedImage getCurrentFrame() {
        return frames[index];
    }

}
