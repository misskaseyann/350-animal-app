package dev.tilegame;

import dev.tilegame.entities.animals.MiniGamePet;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.GameCamera;
import dev.tilegame.input.KeyManager;
import dev.tilegame.input.MouseManager;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.player.Player;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.utils.Utils;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Allows easier management of our classes.
 * @author kaseystowell
 * @version 10.02.2017
 */
public class Manager {

    private Game game;
    private World world;
    private Pet pet;
    private MiniGamePet miniPet;
    private StatsManager statsManager;
    private LoopLoader loopLoader;
    private Player player;
    private Font font = null;

    /**
     * Manager constructor.
     * @param game game object.
     */
    public Manager(Game game) {
        this.game = game;
        try {
            if (font == null) {
                font = Utils.createFont("res/fonts/PokemonClassic.ttf");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return game camera.
     */
    public GameCamera getGameCamera() {
        return game.getGameCamera();
    }

    /**
     * @return key manager.
     */
    public KeyManager getKeyManager() {
        return game.getKeyManager();
    }

    /**
     * @return mouse manager.
     */
    public MouseManager getMouseManager() {
        return game.getMouseManager();
    }

    /**
     * @return screen width.
     */
    public int getWidth() {
        return game.getHeight();
    }

    /**
     * @return screen height.
     */
    public int getHeight() {
        return game.getHeight();
    }

    /**
     * @return game.
     */
    public Game getGame() {
        return game;
    }

    /**
     * @param game game object.
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * @return game world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * @param world game world.
     */
    public void setWorld(World world) {
        this.world = world;
    }

    /**
     * @param pet pet entity.
     */
    public void setPet(Pet pet) { this.pet = pet; }

    /**
     * @return pet entity.
     */
    public Pet getPet() { return pet; }

    /**
     * @param miniPet pet entity.
     */
    public void setMiniPet(MiniGamePet miniPet) { this.miniPet = miniPet; }

    /**
     * @return miniPet entity.
     */
    public MiniGamePet getMiniPet() { return miniPet; }

    /**
     * @param statsManager stats manager.
     */
    public void setStatsManager(StatsManager statsManager) { this.statsManager = statsManager; }

    /**
     * @return stats manager.
     */
    public StatsManager getStatsManager() { return statsManager; }

    /**
     * @return loop loader.
     */
    public LoopLoader getLoopLoader() {
        return loopLoader;
    }

    /**
     * @param loopLoader loop loader.
     */
    public void setLoopLoader(LoopLoader loopLoader) {
        this.loopLoader = loopLoader;
    }

    /**
     * @return player object.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Set the player of the game.
     *
     * @param player player object.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Font getFont() {
        return font;
    }
}
