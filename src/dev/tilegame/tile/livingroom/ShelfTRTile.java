package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfTRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ShelfTRTile(final int id) {
        super(Assets.getShelfTR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
