package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingRightTile extends Tile {

    /**
     * filler.
     * @param id filler
     * */
    public CeilingRightTile(final int id) {
        super(Assets.getCeilingRight(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
