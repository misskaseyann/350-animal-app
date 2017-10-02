package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
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

    @Override
    public void tick() {
        getInput();
        manager.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        if (manager.getKeyManager().up && super.noCollide(manager.getKeyManager())) // temp
            y -= 32; // temp

        if (manager.getKeyManager().down && super.noCollide(manager.getKeyManager()) ) // temp
            y += 32; // temp

        if (manager.getKeyManager().left && super.noCollide(manager.getKeyManager())) // temp
            x -= 32; // temp

        if (manager.getKeyManager().right && super.noCollide(manager.getKeyManager()))// temp
            x += 32; // temp

    }




    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - manager.getGameCamera().getxOffset()),
                (int) (y - manager.getGameCamera().getyOffset()), null);
    }
}
