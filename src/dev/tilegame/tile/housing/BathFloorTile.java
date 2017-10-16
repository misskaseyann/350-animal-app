package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BathFloorTile extends Tile {
    /**
     * Constructor for Bathroom floor tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public BathFloorTile(final int id) {
        super(Assets.getBathFloor(), id);
    }
}
