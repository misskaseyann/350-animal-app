package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Actual gameplay instantiation and home world.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class GameState extends State {

    private Pet pet;
    private World world;
    private LoopLoader music;
    private StatsManager statsManager;


    /**
     * Creates game state with a home world, pet, fresh stats, and instantiates a music loader.
     * @param manager game class manager.
     */
    public GameState(Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world1.txt");
        manager.setWorld(world);
        pet = new Pet(manager, world.getSpawnX()*32, world.getSpawnY()*32);
        manager.setPet(pet);
        statsManager = new StatsManager(pet);
        manager.setStatsManager(statsManager);
        music = new LoopLoader();
        manager.setLoopLoader(music);
    }

    /**
     * Ticks the world and pet, checks for music playing, and listens for button clicks.
     */
    @Override
    public void tick() {
        world.tick();
        pet.tick();
        // Check if music is playing.
        if (!music.isPlaying()) {
            music.load("res/sounds/house.wav");
            music.play();
        }
        // Was the left mouse button pressed?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Main Menu Button
            if ((x > 10 && x < 74) && (y > 490 && y < 554)) {
                State.setLastState(this);
                State.setState(manager.getGame().getMenuState());
            }
            // Feed Button
            if ((x > 0 && x < 70) && (y > 0 && y < 75)) {
                // TODO add imcremental method
                pet.setHunger(6);
            }
            // Talk Button
            if ((x > 70 && x < 136) && (y > 0 && y < 75)) {
                // TODO include barking sound clip
                // TODO add imcremental method
                pet.setHappiness(6);
            }
            // Clean Button
            if ((x > 136 && x < 204) && (y > 0 && y < 75)) {
                // TODO add imcremental method
                pet.setCleanliness(6);
            }
            // Play Button
            if ((x > 204 && x < 252) && (y > 0 && y < 75)) {
                // TODO implement mini games
                // TODO add imcremental method
                pet.setHappiness(6);
            }
            // Inventory Button
            if ((x > 252 && x < 305) && (y > 0 && y < 75)) {
                State.setLastState(this);
                State.setState(manager.getGame().getInventoryState());
            }
            // Travel Button
            if ((x > 305 && x < 360) && (y > 0 && y < 75)) {
                State.setLastState(this);
                State.setState(manager.getGame().getTravelState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Renders the home world and game menus.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);
        // Render top and bottom menu.
        g.drawImage(Assets.getMainMenuTopReg(), 0, 0, null);
        g.drawImage(Assets.getMainMenuBot(), 0, 475, null);
        g.drawImage(Assets.getMenuButton(), 10, 490, null);
        // Render pet stats.
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

    /**
     * @return home world.
     */
    public World getWorld(){ return world; }
}
