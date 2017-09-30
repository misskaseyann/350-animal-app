package dev.tilegame.states;

import dev.tilegame.Game;
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

    public GameState(Game game) {
        super(game);
        world = new World(game, "res/worlds/world1.txt");
        pet = new Pet(game, world.getSpawnX()*32, world.getSpawnY()*32);
    }

    @Override
    public void tick() {
        world.tick();
        pet.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);
    }

    public World getWorld(){ return world;}
}
