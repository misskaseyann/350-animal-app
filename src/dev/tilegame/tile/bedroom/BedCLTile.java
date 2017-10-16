package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedCLTile extends Tile {
    /**
     * Constructor for bed center left tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public BedCLTile(final int id) {
        super(Assets.getBedCL(), id);
    }
}
