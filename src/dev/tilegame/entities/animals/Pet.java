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
    private Random random;
    private int count = 0;
    private int clock = 36000;
    private int [] even = {7200 , 14400, 71600 , 28800 , 36000};
    private int randomInt;
    public Pet(Manager manager, float x, float y) {
        super(manager, x, y);
        health = 3;
        hunger = 3;
        clock --;
    }

    @Override
    public void tick() {
            getInput();
            manager.getGameCamera().centerOnEntity(this);
    }


    private int resetCount(int count){ return count = 100; }

    private int resetClock(int clock){ return clock = 36000;}

    private void getInput() {
        if(clock == 0){ health --; clock = resetClock(clock);}
        if(isEqual(even, clock)){ hunger--;}
        System.out.println(("Health: "+ health));
        System.out.println("Hunger: "+ hunger);
        System.out.println("Clock: "+ clock);
            random = new Random();
            if(count == 0) {
                randomInt = random.nextInt(9);
                randomInt = checkMove(randomInt);
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
        clock--;

    }

    private int checkMove(int move){
        random = new Random();
        if(!super.noCollide(move)){return checkMove(random.nextInt(9));}
        return move;
    }

    private boolean isEqual(int [] list, int num){
        for(int i = 0; i < list.length; i ++){
            if(num == list[i])
                return true;
        }
        return false;
    }



    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }
}
