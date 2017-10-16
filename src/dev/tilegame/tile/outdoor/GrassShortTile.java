package dev.tilegame.tile.outdoor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class GrassShortTile extends Tile {
    /**
     * Constructor for Grass Short tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public GrassShortTile(final int id) {
        super(Assets.getGrassShort(), id);
    }
}
