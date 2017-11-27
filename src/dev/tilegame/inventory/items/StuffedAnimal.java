package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

import java.awt.image.BufferedImage;

/**
 * Stuffed animal object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class StuffedAnimal extends Item {
    /**
     * Basic constructor.
     */
    public StuffedAnimal() {
        super("Stuffed Animal",
                "Cute stuffed hippo. Dogs best" +
                        "\nfriend other than man. This toy" +
                        "\nmakes your pet very happy!",
                15, Assets.getStuffedAnimal(), null);
    }

    /**
     * When player uses a stuffed animal:
     * happiness goes up three points,
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(Pet pet) {
        if (pet.getHappiness() < 4)
            pet.setHappiness(pet.getHappiness() + 3);
        else
            pet.setHappiness(6);
    }
}
