package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WoodFloorTile extends Tile {
    /**
     * Constructor for wood floor tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public WoodFloorTile(final int id) {
        super(Assets.getWoodFloor(), id);
    }
}
