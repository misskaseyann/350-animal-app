package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfBLTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ShelfBLTile(final int id) {
        super(Assets.getShelfBL(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
