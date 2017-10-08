package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Animation;
import dev.tilegame.gfx.Assets;

import java.awt.image.BufferedImage;
import java.util.Random;
import dev.tilegame.input.KeyManager;
import dev.tilegame.states.GameState;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;
import java.awt.*;
import java.util.ArrayList;


/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Pet extends Animal {

    //Animations
    private Animation aniDown, aniUp, aniLeft, aniRight;


    // Random Movement
    private Random random;
    private int count = 0;
    private int randomInt;

    public Pet(final Manager manager, final float x, final float y) {
        super(manager, x, y);

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


    private int resetCount(){ return 100; }

    private int checkMove(int move){
        random = new Random();
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
        random = new Random();
        if (count == 0) {
            randomInt = random.nextInt(9);
            randomInt = checkMove(randomInt);
            System.out.println("Random int: "+ randomInt);
            count = resetCount();
        }
        else {
            randomInt = checkMove(randomInt);
            count--;
        }
        if((count % 2) == 0) {
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
                    setX(getX()+ 3);
                    return aniRight.getCurrentFrame();
                case 5: //Up to the Left
                    y -= 3;
                    setX(getX()- 3);
                    return aniUp.getCurrentFrame();
                case 6: //Up to the Right
                    y -= 3;
                    setX(getX()+ 3);
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
