package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

/**
 * Dog biscuit object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class DogBiscuit extends Item {
    /**
     * Basic constructor.
     */
    public DogBiscuit() {
        super("Dog Biscuit",
                "A yummy biscuit in the shape" + "\nof a heart. Not healthy but"
                        + "\nsatisfies some hunger and" + "\ndogs love biscuits!",
                3, Assets.getDogBiscuit(), Assets.getCookieAni());
    }

    /**
     * When player uses a dog biscuit:
     * health goes down one point,
     * happiness goes up one point,
     * hunger goes up one point.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(final Pet pet) {
        if (pet.getHealth() > 0) {
            pet.setHealth(pet.getHealth() - 1);
        }
        if (pet.getHappiness() < 6) {
            pet.setHappiness(pet.getHappiness() + 1);
        }
        if (pet.getHunger() < 6) {
            pet.setHunger(pet.getHunger() + 1);
        }
    }
}
