package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Animation graphics.
 * @author kaseystowell
 * @version 10.03.2017
 */
public class Animation {

    private int speed, index;
    private long lastTime, timer;
    private BufferedImage[] frames;

    /**
     * Animation constructor.
     * @param speed speed of animation.
     * @param frames animation frames.
     */
    public Animation(final int speed, final BufferedImage[] frames) {
        this.speed = speed;
        this.frames = new BufferedImage[frames.length];
        System.arraycopy(frames, 0, this.frames, 0, frames.length);
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
            if (index >= frames.length)
                index = 0;
        }
    }

    /**
     * @return current animation image.
     */
    public BufferedImage getCurrentFrame() {
        return frames[index];
    }

}
