package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.entities.animals.MiniGamePet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

import java.awt.*;

public class MiniGameState extends State{
    private MiniGamePet pet;
    private World world;
    private LoopLoader music;
    private StatsManager statsManager;

    /**
     * Creates game state with a home world, pet, fresh stats, and instantiates a music loader.
     * @param manager game class manager.
     */
    public MiniGameState(Manager manager) {
        super(manager);
        world = new World(manager, "tbd.txt");
        manager.setWorld(world);
        pet = new MiniGamePet(manager,world.getSpawnX()*32, world.getSpawnY()*32);
        manager.setMiniPet(pet);
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
            music.load("tbd.wav");
            music.play();
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
        g.drawImage(Assets.getMenuButton(), 10, 490, null);

    }

    /**
     * @return home world.
     */
    public World getWorld(){ return world; }
}
