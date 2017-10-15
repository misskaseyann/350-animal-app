package dev.tilegame;

import dev.tilegame.Game;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.GameCamera;
import dev.tilegame.input.KeyManager;
import dev.tilegame.input.MouseManager;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

/**
 * Allows easier management of our classes.
 *
 * @author kaseystowell
 * @version 10.02.2017
 */
public class Manager {
    private Game game;
    private World world;
    private Pet pet;
    private StatsManager statsManager;
    private LoopLoader loopLoader;

    public Manager(Game game) {
        this.game = game;
    }

    public GameCamera getGameCamera() {
        return game.getGameCamera();
    }

    public KeyManager getKeyManager() {
        return game.getKeyManager();
    }

    public MouseManager getMouseManager() {
        return game.getMouseManager();
    }

    public int getWidth() {
        return game.getHeight();
    }

    public int getHeight() {
        return game.getHeight();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public void setPet(Pet pet) { this.pet = pet; }

    public Pet getPet() { return pet; }

    public void setStatsManager(StatsManager statsManager) { this.statsManager = statsManager; }

    public StatsManager getStatsManager() { return statsManager; }

    public LoopLoader getLoopLoader() {
        return loopLoader;
    }

    public void setLoopLoader(LoopLoader loopLoader) {
        this.loopLoader = loopLoader;
    }
}
