package AnimalAppTest;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.inventory.Item;
import dev.tilegame.inventory.items.BaconTreat;
import dev.tilegame.worlds.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kaseystowell
 * @version 10.16.2017
 */
class AnimalTest {

    Pet pet;
    Manager manager;
    World world;

    @Before
    void initialize() {
        manager = new Manager(new Game("Animal Test", 360, 640));
        pet = new Pet(manager, 15, 15);
    }

    @Test
    void setHunger() {
        initialize();
        pet.setHunger(4);
        Assert.assertEquals(4, pet.getHunger());
    }

    @Test
    void setHealth(){
        initialize();
        pet.setHealth(5);
        Assert.assertEquals(5, pet.getHealth());
    }

    @Test
    void setHappiness(){
        initialize();
        pet.setHappiness(4);
        Assert.assertEquals(4, pet.getHappiness());
    }

    @Test
    void setCleanliness(){
        initialize();
        pet.setCleanliness(4);
        Assert.assertEquals(4, pet.getCleanliness());
    }

    @Test
    void isSolid(){
        initialize();
        world = new World(manager, "res/worlds/testWorld.txt");
        Assert.assertEquals(false, world.getTile(0,1));
        Assert.assertEquals(true, world.getTile(1, 1));
    }

    @Test
    void bacon(){
        initialize();
        Item bacon = new BaconTreat();
        pet.setHappiness(5);
        bacon.useItem(pet);
        Assert.assertEquals(6,pet.getHappiness());
    }

}