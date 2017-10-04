package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
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

    public Pet(Manager manager, float x, float y) {
        super(manager, x, y);
    }
    private Random random;
    private int count = 0;
    private int randomInt;

    @Override
    public void tick() {
            getInput();
            manager.getGameCamera().centerOnEntity(this);

    }


    private int resetCount(int count){ return count = 100; }

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
                randomInt = checkMove(randomInt);
                System.out.println("Random int: "+ randomInt);
                count = resetCount(count);

            }
            else { randomInt = checkMove(randomInt); count--; }
        if((count % 2) == 0) {
                switch (randomInt) {
                    case 0: //Rest
                        break;
                    case 1: //Up
                        y -= 3;
                        break;
                    case 2: //Down
                        y += 3;
                        break;
                    case 3: //Left
                        x -= 3;
                        break;
                    case 4: //Right
                        x += 3;
                        break;
                    case 5: //Up to the Left
                        y -= 3;
                        x -= 3;
                        break;
                    case 6: //Up to the Right
                        y -= 3;
                        x += 3;
                        break;
                    case 7: //Down to the Left
                        y += 3;
                        x -= 3;
                        break;
                    case 8: //Down to the Right
                        y += 3;
                        x += 3;
                        break;
                }

        }


        if (manager.getKeyManager().up && super.noKeyCollide(manager.getKeyManager())) // temp
            y -= 32; // temp

        if (manager.getKeyManager().down && super.noKeyCollide(manager.getKeyManager()) ) // temp
            y += 32; // temp

        if (manager.getKeyManager().left && super.noKeyCollide(manager.getKeyManager())) // temp
            x -= 32; // temp

        if (manager.getKeyManager().right && super.noKeyCollide(manager.getKeyManager()))// temp
            x += 32; // temp

    }

    private int checkMove(int move){
        random = new Random();
        if(!super.noCollide(move)){return checkMove(random.nextInt(9));}
        return move;
    }



    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }
}
