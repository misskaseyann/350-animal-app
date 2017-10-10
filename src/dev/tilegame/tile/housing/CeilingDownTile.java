package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingDownTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CeilingDownTile(final int id) {
        super(Assets.getCeilingDown(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
