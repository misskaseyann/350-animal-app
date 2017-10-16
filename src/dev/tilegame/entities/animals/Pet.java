package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;

import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.*;


/**
 * Pet Animal.
 * @author kaseystowell
 * @author allisonbolen
 * @author brendannahed
 * @version 09.24.2017
 */
public class Pet extends Animal {

    // Pet Animations
    private Animation aniDown, aniUp, aniLeft, aniRight;
    // Random Movement
    private Random random;
    private int count = 0;
    private int randomInt;
    private final int RESET_COUNT = 100;

    /**
     * Pet constructor.
     * @param manager game class manager.
     * @param x float x value on canvas.
     * @param y float y value on canvas.
     */
    public Pet(final Manager manager, final float x, final float y) {
        super(manager, x, y);
        // Stats
        health = 6;
        hunger = 6;
        happiness = 6;
        cleanliness = 3;
        clock--;
        // Animations
        aniDown = new Animation(200, Assets.getDogDown());
        aniUp = new Animation(200, Assets.getDogUp());
        aniLeft = new Animation(200, Assets.getDogLeft());
        aniRight = new Animation(200, Assets.getDogRight());
    }

    /**
     * Animate pet based on direction and move.
     * Decrease pet stats.
     */
    @Override
    public void tick() {
        decreaseStats();
        // Animations
        aniDown.tick();
        aniUp.tick();
        aniLeft.tick();
        aniRight.tick();
        // Movement
        getCurrentAnimationFrame();
        manager.getGameCamera().centerOnEntity(this);
    }

    /**
     * @return value 100.
     */
    private int resetCount() {
        return RESET_COUNT;
    }

    /**
     * Checks if an integer in an array matches the desired number.
     * @param list int array.
     * @param num int number.
     * @return true if num is equal to value in array list.
     */
    private boolean isEqual(int[] list, int num) {
        for (int i = 0; i < list.length; i++)
            if (num == list[i])
                return true;
        return false;
    }

    /**
     * Checks if move value collides with a tile.
     * @param move integer value.
     * @return same value if the move will cause collision.
     */
    private int checkMove(int move) {
        random = new Random();
        if (!super.noCollide(move))
            return checkMove(random.nextInt(9));
        return move;
    }

    /**
     * Renders the current pet animation and centers camera on pet.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(),
                (int) (getX() - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }

    /**
     * Check pet movement and animate.
     * @return animation frame of pet.
     */
    private BufferedImage getCurrentAnimationFrame() {
        random = new Random();
        // Random movement for pet.
        if (count == 0) {
            randomInt = random.nextInt(9);
            randomInt = checkMove(randomInt);
            count = resetCount();
        } else {
            randomInt = checkMove(randomInt);
            count--;
        }
        // Find animation frame for pet movement.
        if ((count % 2) == 0) {
            switch (randomInt) {
                case 0: //Rest
                    return Assets.getDog();
                case 1: //Up
                    y -= 3;
                    return aniUp.getCurrentFrame();
                case 2: //Down
                    y += 3;
                    return aniDown.getCurrentFrame();
                case 3: //Left
                    setX(getX() - 3);
                    return aniLeft.getCurrentFrame();
                case 4: //Right
                    setX(getX() + 3);
                    return aniRight.getCurrentFrame();
                case 5: //Up to the Left
                    y -= 3;
                    setX(getX() - 3);
                    return aniUp.getCurrentFrame();
                case 6: //Up to the Right
                    y -= 3;
                    setX(getX() + 3);
                    return aniUp.getCurrentFrame();
                case 7: //Down to the Left
                    y += 3;
                    setX(getX() - 3);
                    return aniDown.getCurrentFrame();
                case 8: //Down to the Right
                    y += 3;
                    setX(getX() + 3);
                    return aniDown.getCurrentFrame();
                default:
                    return Assets.getDog();
            }
        }
        // Find animation frame for pet movement.
        switch (randomInt) {
            case 0: //Rest
                return Assets.getDog();
            case 1: //Up
                return aniUp.getCurrentFrame();
            case 2: //Down
                return aniDown.getCurrentFrame();
            case 3: //Left
                return aniLeft.getCurrentFrame();
            case 4: //Right
                return aniRight.getCurrentFrame();
            case 5: //Up to the Left
                return aniUp.getCurrentFrame();
            case 6: //Up to the Right
                return aniUp.getCurrentFrame();
            case 7: //Down to the Left
                return aniDown.getCurrentFrame();
            case 8: //Down to the Right
                return aniDown.getCurrentFrame();
            default:
                return Assets.getDog();
        }
    }

    /**
     * Decrease the pet stats.
     */
    private void decreaseStats() {
        if (clock == 0)
            resetClock();
        // Reduce health if any of the pets stats are low.
        if ((hunger == 0 || happiness == 0 || cleanliness == 0) && isEqual(even, clock))
            if (!(health == 0))
                health--;
        // Hunger decreases over time.
        if (isEqual(even, clock))
            if (!(hunger == 0))
                hunger--;
        // Cleanliness decreases over time.
        if (even[2] == clock)
            if (!(cleanliness == 0))
                cleanliness--;
        // Happiness decreases over time.
        if ((hunger < 3 || cleanliness < 3) && isEqual(even, clock))
            if (!(happiness == 0))
                happiness--;
        clock--;
    }

}
