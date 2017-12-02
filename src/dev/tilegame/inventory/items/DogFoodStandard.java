package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

import java.awt.image.BufferedImage;

/**
 * Standard dog food object.
 * @author kaseystowell
 * @version 11.26.2017
 */
public class DogFoodStandard extends Item{
    /**
     * Basic constructor.
     */
    public DogFoodStandard() {
        super("Standard Dog Food",
                "Standard Food is nothing special." +
                        "\nHunger is maxed while happiness" + "\nand health goes up.",
                12, Assets.getDogFoodStandard(), Assets.getFoodAni());
    }

    /**
     * When player uses standard dog food:
     * happiness goes up one point,
     * hunger is max.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(Pet pet) {
        if (pet.getHappiness() < 6)
            pet.setHappiness(pet.getHappiness() + 1);
        if (pet.getHealth() < 6)
            pet.setHealth(pet.getHealth() + 1);
        pet.setHunger(6);
    }
}
