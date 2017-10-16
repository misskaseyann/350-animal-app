package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitchenFloorTile extends Tile {
    /**
     * Constructor for kitchen floor tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public KitchenFloorTile(final int id) {
        super(Assets.getKitchenFloor(), id);
    }
}
