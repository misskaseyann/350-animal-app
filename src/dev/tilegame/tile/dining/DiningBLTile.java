package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningBLTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public DiningBLTile(final int id) {
        super(Assets.getDiningBL(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
