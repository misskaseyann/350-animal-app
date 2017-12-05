package dev.tilegame;

import dev.tilegame.entities.animals.MiniGamePet;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.GameCamera;
import dev.tilegame.input.KeyManager;
import dev.tilegame.input.MouseManager;
import dev.tilegame.player.Player;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.utils.Utils;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * Allows easier management of our classes.
 *
 * @author kaseystowell
 * @version 10.02.2017
 */
public class Manager {
    /**
     * game for the manager.
     */
    private Game game;
    /**
     * manager for the game.
     */
    private World world;
    /**
     * manager for the pet.
     */
    private Pet pet;
    /**
     * mini game for manager.
     */
    private MiniGamePet miniPet;
    /**
     * stats manager for manager.
     */
    private StatsManager statsManager;
    /**
     * looploader for manager.
     */
    private LoopLoader loopLoader;
    /**
     * player for manager.
     */
    private Player player;
    /**
     * font for manager.
     */
    private Font font = null;

    /**
     * Manager constructor.
     *
     * @param inGame game object.
     */
    public Manager(final Game inGame) {
        this.game = inGame;
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
     * @param inGame game object.
     */
    public void setGame(final Game inGame) {
        this.game = inGame;
    }

    /**
     * @return game world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * @param inWorld game world.
     */
    public void setWorld(final World inWorld) {
        this.world = inWorld;
    }

    /**
     * @return pet entity.
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * @param inPet pet entity.
     */
    public void setPet(final Pet inPet) {
        this.pet = inPet;
    }

    /**
     * @return miniPet entity.
     */
    public MiniGamePet getMiniPet() {
        return miniPet;
    }

    /**
     * @param inMiniPet pet entity.
     */
    public void setMiniPet(final MiniGamePet inMiniPet) {
        this.miniPet = inMiniPet;
    }

    /**
     * @return stats manager.
     */
    public StatsManager getStatsManager() {
        return statsManager;
    }

    /**
     * @param inStatsManager stats manager.
     */
    public void setStatsManager(final StatsManager inStatsManager) {
        this.statsManager = inStatsManager;
    }

    /**
     * @return loop loader.
     */
    public LoopLoader getLoopLoader() {
        return loopLoader;
    }

    /**
     * @param inLoopLoader loop loader.
     */
    public void setLoopLoader(final LoopLoader inLoopLoader) {
        this.loopLoader = inLoopLoader;
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
     * @param inPlayer player object.
     */
    public void setPlayer(final Player inPlayer) {
        this.player = inPlayer;
    }
    /** get the font.
     * @return font*/
    public Font getFont() {
        return font;
    }

}
