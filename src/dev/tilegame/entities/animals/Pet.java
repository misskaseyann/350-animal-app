package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;
import dev.tilegame.utils.Utils;

import java.awt.*;
import java.util.ArrayList;


/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Pet extends Animal {

    public Pet(Game game, float x, float y) {
        super(game, x, y);
    }

    @Override
    public void tick() {
        getInput();
        game.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        if (game.getKeyManager().up) // temp
            y -= 32; // temp
        System.out.println("y "+ super.gridLoc()[1]);
        if (game.getKeyManager().down) // temp
            y += 32; // temp
            System.out.println(y);
        System.out.println("y "+ super.gridLoc()[1]);
        if (game.getKeyManager().left) // temp
            x -= 32; // temp
        System.out.println("x "+ super.gridLoc()[0]);
        if (game.getKeyManager().right) // temp
            x += 32; // temp
            System.out.println(x);
        System.out.println("x "+ super.gridLoc()[0]);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - game.getGameCamera().getxOffset()),
                (int) (y - game.getGameCamera().getyOffset()), null);
    }
}
