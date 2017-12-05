package dev.tilegame.entities.animals;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;
import dev.tilegame.states.State;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Pet AI.
 *
 * @author brendannahed
 * @version 10.08.2017
 */
public class MiniGamePet extends Animal {

    //Animations
    /**
     * animation for the pet in directions.
     */
    private Animation aniDown, aniUp, aniLeft, aniRight;


    /**
     * Pet AI Constructor.
     *
     * @param manager class manager.
     * @param x       float x value on canvas.
     * @param y       float y value on canvas.
     */
    public MiniGamePet(final Manager manager, final float x, final float y) {
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
        manager.getGameCamera().centerOnEntity(this);

    }

    /**
     * Checks if move value collides with a tile.
     *
     * @param move integer value.
     * @return same value if the move will cause collision.
     */
    private int checkMove(final int move) {
        if (!super.noCollide(move)) {
            return 0;
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
        int movement = 0;
        if (manager.getKeyManager().isUp() && manager.getKeyManager().isLeft()) {
            movement = 5;
        } else if (manager.getKeyManager().isUp() && manager.getKeyManager().isRight()) {
            movement = 6;
        } else if (manager.getKeyManager().isDown() && manager.getKeyManager().isLeft()) {
            movement = 7;
        } else if (manager.getKeyManager().isDown() && manager.getKeyManager().isRight()) {
            movement = 8;
        } else if (manager.getKeyManager().isDown()) {
            movement = 2;
        } else if (manager.getKeyManager().isUp()) {
            movement = 1;
        } else if (manager.getKeyManager().isLeft()) {
            movement = 3;
        } else if (manager.getKeyManager().isRight()) {
            movement = 4;
        }
        movement = checkMove(movement);

        // Find animation for AI movement.
        switch (movement) {
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

//        // Find animation for AI movement.
//        switch (movement) {
//            case 0: //Rest
//                return Assets.getDog();
//            case 1: //Up
//                return aniUp.getCurrentFrame();
//            case 2: //Down
//                return aniDown.getCurrentFrame();
//            case 3: //Left
//                return aniLeft.getCurrentFrame();
//            case 4: //Right
//                return aniRight.getCurrentFrame();
//            case 5: //Up to the Left
//                return aniUp.getCurrentFrame();
//            case 6: //Up to the Right
//                return aniUp.getCurrentFrame();
//            case 7: //Down to the Left
//                return aniDown.getCurrentFrame();
//            case 8: //Down to the Right
//                return aniDown.getCurrentFrame();
//            default:
//                return Assets.getDog();
//        }
    }

    /**
     * @return True if the game is over.
     */
    public boolean miniGameOver() {
        int[][] tiles = State.getCurrentState().getWorld().getTiles();
        if (tiles[gridLocX()][gridLocY()] == 95) {
            return true;
        }
        return false;
    }

}
