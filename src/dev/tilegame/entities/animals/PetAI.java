package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Pet AI.
 *
 * @author brendannahed
 * @version 10.08.2017
 */
public class PetAI extends Animal {

    /**
     * reset count.
     */
    private final int RESET_COUNT = 100;
    // Random Movement
    /**
     * animation for the pet.
     */
    private Animation aniDown, aniUp, aniLeft, aniRight;
    /**
     * random.
     */
    private Random random;
    /**
     * count.
     */
    private int count = 0;
    /**
     * randint.
     */
    private int randomInt;

    /**
     * Pet AI Constructor.
     *
     * @param manager class manager.
     * @param x       float x value on canvas.
     * @param y       float y value on canvas.
     */
    public PetAI(final Manager manager, final float x, final float y) {
        super(manager, x, y);
        // Animations
        aniDown = new Animation(200, Assets.getDogDown());
        aniUp = new Animation(200, Assets.getDogUp());
        aniLeft = new Animation(200, Assets.getDogLeft());
        aniRight = new Animation(200, Assets.getDogRight());
    }

    /**
     * Animates the AI Pet.
     */
    @Override
    public void tick() {
        // Animations
        aniDown.tick();
        aniUp.tick();
        aniLeft.tick();
        aniRight.tick();
    }

    /**
     * @return int value 100.
     */
    private int resetCount() {
        return RESET_COUNT;
    }

    /**
     * Checks if move value collides with a tile.
     *
     * @param move integer value.
     * @return same value if the move will cause collision.
     */
    private int checkMove(final int move) {
        random = new Random();
        if (!super.noCollide(move)) {
            return checkMove(random.nextInt(9));
        }
        return move;
    }

    /**
     * Renders the current pet AI animation.
     *
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        g.drawImage(getCurrentAnimationFrame(),
                (int) (x - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }

    /**
     * Check pet movement and animate.
     *
     * @return animation frame of pet.
     */
    private BufferedImage getCurrentAnimationFrame() {
        random = new Random();
        // Random movement for Pet AI.
        if (count == 0) {
            randomInt = random.nextInt(9);
            randomInt = checkMove(randomInt);
            count = resetCount();
        } else {
            randomInt = checkMove(randomInt);
            count--;
        }
        // Find animation for AI movement.
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
                    x -= 3;
                    return aniLeft.getCurrentFrame();
                case 4: //Right
                    x += 3;
                    return aniRight.getCurrentFrame();
                case 5: //Up to the Left
                    y -= 3;
                    x -= 3;
                    return aniUp.getCurrentFrame();
                case 6: //Up to the Right
                    y -= 3;
                    x += 3;
                    return aniUp.getCurrentFrame();
                case 7: //Down to the Left
                    y += 3;
                    x -= 3;
                    return aniDown.getCurrentFrame();
                case 8: //Down to the Right
                    y += 3;
                    x += 3;
                    return aniDown.getCurrentFrame();
                default:
                    return Assets.getDog();
            }
        }
        // Find animation for AI movement.
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

}
