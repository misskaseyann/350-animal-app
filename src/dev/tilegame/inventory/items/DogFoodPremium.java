package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

/**
 * Premium dog food object.
 * @author kaseystowell
 * @version 11.26.2017
 */
public class DogFoodPremium extends Item {
    /**
     * Basic constructor.
     */
    public DogFoodPremium() {
        super("Premium Dog Food",
                "Premium Food made with natural"
                        + "\ningredients. Very healthy!"
                        + "\nMaxes out your dogs stats.",
                34, Assets.getDogFoodPremium(), Assets.getFoodAni());
    }

    /**
     * When player uses premium dog food:
     * happiness is max,
     * hunger is max,
     * health is max.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(final Pet pet) {
        pet.setHappiness(6);
        pet.setHealth(6);
        pet.setHunger(6);
    }

}
