package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class RugBRTile extends Tile {
    /**
     * Constructor for rug bottom right tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public RugBRTile(final int id) {
        super(Assets.getRugBR(), id);
    }
}
