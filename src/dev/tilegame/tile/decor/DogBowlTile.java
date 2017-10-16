package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DogBowlTile extends Tile {
    /**
     * Constructor for dog bowl tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public DogBowlTile(final int id) {
        super(Assets.getDogBowl(), id);
    }
}
