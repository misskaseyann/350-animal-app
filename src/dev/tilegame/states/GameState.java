package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.entities.animals.Pet_AI;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.ClipLoader;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
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
    //private ClipLoader clip;
    private StatsManager statsManager;

    public GameState(Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world1.txt");
        manager.setWorld(world);
        pet = new Pet(manager, world.getSpawnX()*32, world.getSpawnY()*32);
        statsManager = new StatsManager(pet);
        music = new LoopLoader();
        //clip = new ClipLoader();
        //clip.load("sounds/dogbark.wav");
    }

    @Override
    public void tick() {
        world.tick();
        pet.tick();
        if (!music.isPlaying()) {
            music.load("res/sounds/house.wav");
            music.play();
        }
        if (manager.getMouseManager().getLeftPress()) {
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            if ((x > 10 && x < 74) && (y > 490 && y < 554))
                State.setState(manager.getGame().getMenuState());
            if ((x > 0 && x < 70) && (y > 0 && y < 75)) {
                pet.setHunger(6);
            }
            if ((x > 70 && x < 136) && (y > 0 && y < 75)) {
                // eventually increment happiness
                pet.setHappiness(6);
                //clip.play(); dog barking
            }
            if ((x > 136 && x < 204) && (y > 0 && y < 75)) {
                pet.setCleanliness(6);
            }
            if ((x > 204 && x < 252) && (y > 0 && y < 75)) {
                // eventually increment happiness
                pet.setHappiness(6);
            }
            if ((x > 252 && x < 305) && (y > 0 && y < 75)) {
                State.setState(manager.getGame().getInventoryState());
            }
            if ((x > 305 && x < 360) && (y > 0 && y < 75)) {
                State.setState(manager.getGame().getTravelState());
            }
        }
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);
        g.drawImage(Assets.getMainMenuTop(), 0, 0, null);
        g.drawImage(Assets.getMainMenuBot(), 0, 475, null);
        g.drawImage(Assets.getMenuButton(), 10, 490, null);
        // stats
        g.drawImage(statsManager.emojiBox(), 10, 564, null); //implement later. doesnt look pretty.
        g.drawImage(Assets.getHealth(), 95, 497, null);
        g.drawImage(statsManager.healthBar(), 90, 513, null);
        g.drawImage(Assets.getHunger(), 95, 569, null);
        g.drawImage(statsManager.hungerBar(), 90, 585, null);
        g.drawImage(Assets.getHappiness(), 230, 497, null);
        g.drawImage(statsManager.happyBar(), 225, 513, null);
        g.drawImage(Assets.getHygene(), 230, 569, null);
        g.drawImage(statsManager.cleanBar(), 225, 585, null);
    }

    public World getWorld(){ return world;}
}
