package dev.tilegame.worlds;

import dev.tilegame.Game;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class World {

    private Game game;
    private int width, height;
    private int spawnX, spawnY;

    public int[][] getTiles() {
        return tiles;
    }

    private int[][] tiles;

    public World(Game game, String path) {
        this.game = game;
        loadWorld(path);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                getTile(x,y).render(g, (int) (x * Tile.TILEWIDTH - game.getGameCamera().getxOffset()),
                        (int) (y * Tile.TILEHEIGHT - game.getGameCamera().getyOffset()));
            }
        }
    }

    public Tile getTile(int x, int y) {
        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null)
            return Tile.woodFloorTile;
        return t;
    }

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



    public int getSpawnX(){
        return spawnX;
    }

    public int getSpawnY(){
        return spawnY;
    }
}
