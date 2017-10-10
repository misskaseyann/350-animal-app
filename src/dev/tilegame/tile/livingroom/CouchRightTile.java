package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CouchRightTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CouchRightTile(final int id) {
        super(Assets.getCouchRight(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
