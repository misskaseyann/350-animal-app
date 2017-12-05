package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.entities.animals.Pet_AI;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Park world.
 * Generates a top menu for taking care of your pet but eliminates the option for feeding and cleaning.
 * Generates a bottom menu for monitoring your pets stats and accessing main menu.
 * @author kaseystowell
 * @version 10.14.2017
 */
public class ParkState extends State {

    private Pet pet;
    private Pet_AI pet_ai;
    private World world;
    private LoopLoader music, sounds;
    private StatsManager statsManager;

    /**
     * Park state constructor.
     * Sets up the park world, loads the pet and its stats, and sets up music with current loop loader.
     * @param manager game class manager.
     */
    public ParkState(Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world2.txt");
        manager.setWorld(world);
        pet = manager.getPet();
        pet_ai = new Pet_AI(manager, 10*32, 10*32);
        statsManager = manager.getStatsManager();
        music = manager.getLoopLoader();
        sounds = new LoopLoader();
    }

    /**
     * Ticks world and pet.
     * Makes sure that park music is playing.
     * Checks for button presses.
     */
    @Override
    public void tick() {
        world.tick();
        pet.tick();
        pet_ai.tick();
        // Check for park music.
        if (!music.isPlaying()) {
            music.load("res/sounds/doggo2.wav");
            music.play();
        }
        // Did the mouse left click?
            if (manager.getMouseManager().getLeftPress()) {
                // Set x and y coordinates.
                int x = manager.getMouseManager().getMouseX();
                int y = manager.getMouseManager().getMouseY();
                // Main Menu Button
                if ((x > 10 && x < 74) && (y > 490 && y < 554)) {
                    State.setLastState(this);
                    State.setState(manager.getGame().getMenuState());
                }
                // Talk Button
                if ((x > 70 && x < 136) && (y > 0 && y < 75)) {
                    sounds.load("res/sounds/chasdog.wav");
                    sounds.play();
                    pet.setHappiness(6);
                }
                // Play Button
                if ((x > 204 && x < 252) && (y > 0 && y < 75)) {
                    sounds.load("res/sounds/squeeze-toy-4.wav");
                    sounds.play();
                    pet.setHappiness(6);
                    music.stop();
                    State.setLastState(this);
                    State.setState(new MiniGameState(manager));
                }
                // Inventory Button
                if ((x > 252 && x < 305) && (y > 0 && y < 75)) {
                    sounds.load("res/sounds/bag-zipper-1.wav");
                    sounds.play();
                    State.setLastState(this);
                    State.setState(manager.getGame().getInventoryState());
                }
                // Travel Button
                if ((x > 305 && x < 360) && (y > 0 && y < 75)) {
                    sounds.load("res/sounds/door-10-open.wav");
                    sounds.play();
                    State.setLastState(this);
                    State.setState(manager.getGame().getTravelState());
                }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Renders the park scene and game menu.
     *
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        world.render(g);
        pet.render(g);
        pet_ai.render(g);
        // Draw menus.
        g.drawImage(Assets.getMainMenuTopTravel(), 0, 0, null);
        g.drawImage(Assets.getMainMenuBot(), 0, 475, null);
        g.drawImage(Assets.getMenuButton(), 10, 490, null);
        // Draw stats.
        g.drawImage(statsManager.emojiBox(), 10, 564, null);
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
     * @return park world.
     */
    public World getWorld(){ return world;}

}
