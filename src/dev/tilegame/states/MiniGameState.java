package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.entities.animals.MiniGamePet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * mini game handler.
 * @author Brendan Nahed
 * @version 11.23.17
 */
public class MiniGameState extends State {
    /**
     * minigame pet for state.
     */
    private MiniGamePet pet;
    /**
     * World.
     */
    private World world;
    /**
     * looploader music and sound.
     */
    private LoopLoader music, sounds;
    /**
     * statsmanager manager.
     */
    private StatsManager statsManager;

    /**
     * Creates game state with a home world, pet, fresh stats, and instantiates a music loader.
     *
     * @param manager game class manager.
     */
    public MiniGameState(final Manager manager) {
        super(manager);
        world = new World(manager, "res/worlds/world3.txt");
        manager.setWorld(world);
        pet = new MiniGamePet(manager, world.getSpawnX() * 32, world.getSpawnY() * 32);
        manager.setMiniPet(pet);
        statsManager = new StatsManager(pet);
        manager.setStatsManager(statsManager);
        music = new LoopLoader();
        sounds = new LoopLoader();
        manager.setLoopLoader(music);
    }

    /**
     * Ticks the world and pet, checks for music playing, and listens for button clicks.
     */
    @Override
    public void tick() {
        world.tick();
        pet.tick();
        if (pet.miniGameOver()) {
            music.stop();
            manager.getPlayer().setMoney(manager.getPlayer().getMoney() + 50);
            State.setState(State.getLastState());
        }
        // Check if music is playing.
        if (!music.isPlaying()) {
            music.load("res/sounds/doggo2.wav");
            music.play();
        }

        if (manager.getMouseManager().getLeftPress()) {
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            if ((x > 305 && x < 360) && (y > 0 && y < 75)) {
                sounds.load("res/sounds/door-10-open.wav");
                sounds.play();
                music.stop();
                State.setLastState(this);
                State.setState(manager.getGame().getTravelState());
            }
        }
        manager.getMouseManager().setLeftPress(false);

    }

    /**
     * Renders the home world and game menus.
     *
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        world.render(g);
        pet.render(g);
        // Render top and bottom menu.
        g.drawImage(Assets.getMainMenuTopTravel(), 0, 0, null);
    }

    /**
     * @return home world.
     */
    public World getWorld() {
        return world;
    }
}
