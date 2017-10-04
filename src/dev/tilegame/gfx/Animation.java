package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * @author kaseystowell
 * @version 10.03.2017
 */
public class Animation {
    private int speed, index;
    private long lastTime, timer;
    private BufferedImage[] frames;

    public Animation(int speed, BufferedImage[] frames) {
        this.speed = speed;
        this.frames = frames;
        index = 0;
        timer = 0;
        lastTime = System.currentTimeMillis();
    }

    public void tick() {
        // time in milliseconds since the last tick method called.
        timer += System.currentTimeMillis() - lastTime;
        // reset it to the time this tick method is called
        lastTime = System.currentTimeMillis();

        // once timer exceeds speed, we reset timer and increment index variable of animation image
        if(timer > speed) {
            index++;
            timer = 0;
            if(index >= frames.length)
                index = 0;
        }
    }

    public BufferedImage getCurrentFrame() {
        return frames[index];
    }
}
