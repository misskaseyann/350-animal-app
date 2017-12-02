package dev.tilegame.tile.outdoor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class MiniGameGrassShortTile extends Tile {
    /**
     * Constructor for Mini GameGrass Short tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public MiniGameGrassShortTile(final int id) {
        super(Assets.getGrassShort(), id);
    }

}
