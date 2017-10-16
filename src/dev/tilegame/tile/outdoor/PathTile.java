package dev.tilegame.tile.outdoor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PathTile extends Tile {
    /**
     * Constructor of a tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public PathTile(final int id) {
        super(Assets.getPath(), id);
    }
}
