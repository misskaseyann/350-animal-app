package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedTRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public BedTRTile(final int id) {
        super(Assets.getBedTR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
