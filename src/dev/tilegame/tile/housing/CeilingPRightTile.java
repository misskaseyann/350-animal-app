package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingPRightTile extends Tile {

    /**
     * filler.
     * @param id filler
     * */
    public CeilingPRightTile(final int id) {
        super(Assets.getCeilingPRight(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
