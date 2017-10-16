package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class RugBCTile extends Tile {
    /**
     * Constructor for rug bottom center tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public RugBCTile(final int id) {
        super(Assets.getRugBC(), id);
    }
}
