package dev.tilegame.inventory.items;

import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;

/**
 * Bacon treat object.
 *
 * @author kaseystowell
 * @version 11.26.2017
 */
public class BaconTreat extends Item {
    /**
     * Basic constructor.
     */
    public BaconTreat() {
        super("Bacon Treat",
                "A yummy bacon flavored treat. "
                        + "\nNot healthy but satisfies"
                        + "\nsome hunger.."
                        + "\nDogs love this snack!",
                10, Assets.getBaconTreat(), Assets.getBaconAni());
    }

    /**
     * When player uses a bacon treat:
     * health goes down one point,
     * happiness goes up two points,
     * hunger goes up one point.
     *
     * @param pet Pet object in the game.
     */
    @Override
    public void useItem(final Pet pet) {
        if (pet.getHealth() > 0) {
            pet.setHealth(pet.getHealth() - 1);
        }
        if (pet.getHappiness() < 5) {
            pet.setHappiness(pet.getHappiness() + 2);
        } else {
            pet.setHappiness(6);
        }
        if (pet.getHunger() < 6) {
            pet.setHunger(pet.getHunger() + 1);
        }
    }


}
