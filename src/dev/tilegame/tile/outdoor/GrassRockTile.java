package dev.tilegame.tile.outdoor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class GrassRockTile extends Tile {
    /**
     * Constructor for Grass Rock tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public GrassRockTile(final int id) {
        super(Assets.getGrassRock(), id);
    }
}
