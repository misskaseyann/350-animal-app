package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class StoneFloorTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public StoneFloorTile(final int id) {
        super(Assets.getStoneFloor(), id);
    }
}
