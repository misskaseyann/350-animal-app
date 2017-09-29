package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;
import java.util.Random;
import java.awt.*;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Pet extends Animal {

    public Pet(Game game, float x, float y) {
        super(game, x, y);
    }
    private Random random;
    private int count = 0;
    private int randomInt;

    @Override
    public void tick() {
            getInput();
        game.getGameCamera().centerOnEntity(this);
    }

    private void resetCount(){
        count = 100;
    }
    private void getInput() {
//        if (game.getKeyManager().up) // temp
//            y -= 3; // temp
//        if (game.getKeyManager().down) // temp
//            y += 3; // temp
//        if (game.getKeyManager().left) // temp
//            x -= 3; // temp
//        if (game.getKeyManager().right) // temp
//            x += 3; // temp
            random = new Random();
            if(count == 0) {
                randomInt = random.nextInt(9);
                System.out.println(randomInt);
                resetCount();
            }
            else { count--; }
            switch (randomInt) {
                case 0: //Rest
                    break;
                case 1: //Up
                    y -= 1;
                    break;
                case 2: //Down
                    y += 1;
                    break;
                case 3: //Left
                    x -= 1;
                    break;
                case 4: //Right
                    x += 1;
                    break;
                case 5: //Up to the Left
                    y -= 1;
                    x -= 1;
                    break;
                case 6: //Up to the Right
                    y -= 1;
                    x += 1;
                    break;
                case 7: //Down to the Left
                    y += 1;
                    x -= 1;
                    break;
                case 8: //Down to the Right
                    y += 1;
                    x += 1;
                    break;
            }
        }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - game.getGameCamera().getxOffset()),
                (int) (y - game.getGameCamera().getyOffset()), null);
    }
}
