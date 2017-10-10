package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ChairRightTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ChairRightTile(final int id) {
        super(Assets.getChairRight(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
