package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfBRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ShelfBRTile(final int id) {
        super(Assets.getShelfBR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
