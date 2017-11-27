package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

import java.awt.image.BufferedImage;

/**
 * Tennis ball object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class TennisBall extends Item {
    /**
     * Basic constructor.
     */
    public TennisBall() {
        super("Tennis Ball", 3, Assets.getTennisBall(), null);
    }

    /**
     * When player uses a tennis ball:
     * happiness goes up one point.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(Pet pet) {
        if (pet.getHappiness() < 6)
            pet.setHappiness(pet.getHappiness() + 1);
    }
}
