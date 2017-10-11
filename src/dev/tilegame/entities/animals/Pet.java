package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;

import java.awt.image.BufferedImage;
import java.util.Random;

import java.awt.*;


/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Pet extends Animal {
    /***
     * Private Animations are four different
     * Animations that the pet has for movement.
     */
    private Animation aniDown, aniUp, aniLeft, aniRight;


    // Random Movement
    private Random random;
    private int count = 0;
    private int randomInt;

    public Pet(final Manager manager, final float x, final float y) {
        super(manager, x, y);
        health = 6;
        hunger = 6;
        happiness = 6;
        cleanliness = 6;
        clock--;
        // Animations
        aniDown = new Animation(200, Assets.getDogDown());
        aniUp = new Animation(200, Assets.getDogUp());
        aniLeft = new Animation(200, Assets.getDogLeft());
        aniRight = new Animation(200, Assets.getDogRight());

    }

    @Override
    public void tick() {
        // Animations
        aniDown.tick();
        aniUp.tick();
        aniLeft.tick();
        aniRight.tick();

        //Movement
        //getInput();
        getCurrentAnimationFrame();
        manager.getGameCamera().centerOnEntity(this);

    }


    private int resetCount() {
        return 100;
    }

    private boolean isEqual(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            if (num == list[i])
                return true;
        }
        return false;
    }

    private int checkMove(int move) {
        random = new Random();
        if (!super.noCollide(move)) {
            return checkMove(random.nextInt(9));
        }
        if (!super.noCollide(move)) {
            return checkMove(random.nextInt(9));
        }
        return move;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (getX() - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }

    private BufferedImage getCurrentAnimationFrame() {
        if (clock == 0) {
            resetClock();
        }
        if ((hunger == 0 || happiness == 0 || cleanliness == 0) && isEqual(even, clock)) {
            health--;
        } //If user doesn't feed the pet health decreases.
        if (isEqual(even, clock)) {
            hunger--;
        } //Over time the pet's hunger decrease until owner feeds pet.
        if (even[2] == clock) {
            cleanliness--;
        }
        clock--;
        random = new Random();
        if (count == 0) {
            randomInt = random.nextInt(9);
            randomInt = checkMove(randomInt);
            count = resetCount();
        } else {
            randomInt = checkMove(randomInt);
            count--;
        }
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
