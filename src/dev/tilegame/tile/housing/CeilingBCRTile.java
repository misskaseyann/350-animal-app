package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingBCRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CeilingBCRTile(final int id) {
        super(Assets.getCeilingBCR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
