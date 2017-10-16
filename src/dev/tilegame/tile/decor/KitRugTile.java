package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitRugTile extends Tile {
    /**
     * Constructor for kitchen rug tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public KitRugTile(final int id) {
        super(Assets.getKitRug(), id);
    }
}
