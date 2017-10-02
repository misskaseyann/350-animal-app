package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Actual gameplay.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class GameState extends State {

    private Pet pet;
    private World world;

    public GameState(Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world1.txt");
        manager.setWorld(world);
        pet = new Pet(manager, world.getSpawnX()*32, world.getSpawnY()*32);
    }

    @Override
    public void tick() {
        world.tick();
        pet.tick();
        if (manager.getKeyManager().esc)
            State.setState(manager.getGame().getMenuState());
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);

    }

    public World getWorld(){ return world;}
}
