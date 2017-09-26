package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;

import java.awt.*;

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
            y -= 3; // temp
        if (game.getKeyManager().down) // temp
            y += 3; // temp
        if (game.getKeyManager().left) // temp
            x -= 3; // temp
        if (game.getKeyManager().right) // temp
            x += 3; // temp
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - game.getGameCamera().getxOffset()),
                (int) (y - game.getGameCamera().getyOffset()), null);
    }
}
