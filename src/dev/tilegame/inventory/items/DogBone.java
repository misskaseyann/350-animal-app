package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

import java.awt.image.BufferedImage;

/**
 * Dog bone object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class DogBone extends Item{
    /**
     * Basic constructor.
     */
    public DogBone() {
        super("Dog Bone",
                "A typical dog bone for chewing." +
                        "\nDogs really love bones!" +
                        "\nSatisfies some hunger.",
                12, Assets.getChewBone(), null);
    }

    /**
     * When player uses a bone:
     * happiness goes up two points,
     * hunger goes up one point.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(Pet pet) {
        if (pet.getHappiness() < 5)
            pet.setHappiness(pet.getHappiness() + 2);
        else
            pet.setHappiness(6);
        if (pet.getHunger() < 6)
            pet.setHunger(pet.getHunger() + 1);
    }
}
