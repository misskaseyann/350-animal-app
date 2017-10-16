package dev.tilegame.worlds;

import dev.tilegame.Manager;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;

import java.awt.*;

/**
 * World builder class.
 * @author kaseystowell
 * @author allisonbolen
 * @version 09.24.2017
 */
public class World {

    private Manager manager;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;

    /**
     * World constructor.
     * @param manager game class manager.
     * @param path string path of world txt file.
     */
    public World(Manager manager, String path) {
        this.manager = manager;
        loadWorld(path);
    }

    /**
     * Helper method for world.
     * Empty for now.
     */
    public void tick() {
        // do nothing
    }

    /**
     * Renders the world tiles.
     * @param g graphics object.
     */
    public void render(Graphics g) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                getTile(x,y).render(g,
                        (int) (x * Tile.TILEWIDTH - manager.getGameCamera().getxOffset()),
                        (int) (y * Tile.TILEHEIGHT - manager.getGameCamera().getyOffset()));
            }
        }
    }

    /**
     * Get the tile in the 2d array.
     * @param x location in 2d array.
     * @param y location in 2d array.
     * @return tile in x,y location.
     */
    public Tile getTile(int x, int y) {
        Tile t = Tile.getTiles()[tiles[x][y]];
        if (t == null)
            return Tile.woodFloorTile;
        return t;
    }

    /**
     * Loads the world, identifies its size and start location of entity.
     * @param path string path of world .txt.
     */
    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);
        tiles = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }

    /**
     * @return tiles array.
     */
    public int[][] getTiles() {
        int[][] tiles1;
        return  tiles1 = tiles;
    }

    /**
     * @return spawn x location of entity.
     */
    public int getSpawnX(){
        return spawnX;
    }

    /**
     * @return spawn y location of entity.
     */
    public int getSpawnY(){
        return spawnY;
    }
}
