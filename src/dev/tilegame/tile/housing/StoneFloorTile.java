package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class StoneFloorTile extends Tile {
    /**
     * Constructor for stone floor tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public StoneFloorTile(final int id) {
        super(Assets.getStoneFloor(), id);
    }
}
