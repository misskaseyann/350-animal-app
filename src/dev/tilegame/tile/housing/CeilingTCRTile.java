package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingTCRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CeilingTCRTile(final int id) {
        super(Assets.getCeilingTCR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
