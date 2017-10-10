package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingLeftTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CeilingLeftTile(final int id) {
        super(Assets.getCeilingLeft(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
