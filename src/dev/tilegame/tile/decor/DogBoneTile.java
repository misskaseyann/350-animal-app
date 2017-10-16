package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DogBoneTile extends Tile {
    /**
     * Constructor for dog bone tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public DogBoneTile(final int id) {
        super(Assets.getDogBone(), id);
    }
}
