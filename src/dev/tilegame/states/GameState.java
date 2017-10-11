package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.entities.animals.Pet_AI;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
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
    private LoopLoader music;

    public GameState(Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world1.txt");
        manager.setWorld(world);
        pet = new Pet(manager, world.getSpawnX()*32, world.getSpawnY()*32);
        music = new LoopLoader();
    }

    @Override
    public void tick() {
        world.tick();
        pet.tick();
        if (!music.isPlaying()) {
            music.load("res/sounds/house.wav");
            music.play();
        }
        if (manager.getKeyManager().esc) {
            //music.stop();
            State.setState(manager.getGame().getMenuState());
        }
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);
        g.drawImage(Assets.getMainMenuTop(), 0, 0, null);
        g.drawImage(Assets.getMainMenuBot(), 0, 475, null);
    }

    public World getWorld(){ return world;}
}
