package AnimalAppTest;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Animal;
import dev.tilegame.entities.animals.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kaseystowell
 * @version 10.16.2017
 */
class AnimalTest {

    Animal pet;
    Manager manager;
    Game game;

    @Before
    void initialize() {
        manager = new Manager(game);
        pet = new Pet(manager, 15, 15);
    }

    @Test
    void setHunger() {
        initialize();
        pet.setHunger(4);
        Assert.assertEquals(4, pet.getHunger());
    }

}