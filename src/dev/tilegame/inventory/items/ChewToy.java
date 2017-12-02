package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

import java.awt.image.BufferedImage;

/**
 * Chew toy object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class ChewToy extends Item {
    /**
     * Basic constructor.
     */
    public ChewToy() {
        super("Chew Toy",
                "A chew toy in the style of a kong." +
                        "\nThis toy brings a lot of" + "\nhappiness to dogs.",
                8, Assets.getChewToy(), Assets.getChewToyAni());
    }

    /**
     * When player uses a chew toy:
     * happiness goes up two points.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(Pet pet) {
        if (pet.getHappiness() < 5)
            pet.setHappiness(pet.getHappiness() + 2);
        else
            pet.setHappiness(6);
    }
}
