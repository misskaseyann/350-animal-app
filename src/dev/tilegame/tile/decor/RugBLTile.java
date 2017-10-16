package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class RugBLTile extends Tile {
    /**
     * Constructor for rug bottom left tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public RugBLTile(final int id) {
        super(Assets.getRugBL(), id);
    }
}
