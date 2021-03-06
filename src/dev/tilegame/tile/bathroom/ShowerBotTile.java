package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShowerBotTile extends Tile {
    /**
     * Constructor for shower bottom tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public ShowerBotTile(final int id) {
        super(Assets.getShowerBot(), id);
    }
}
