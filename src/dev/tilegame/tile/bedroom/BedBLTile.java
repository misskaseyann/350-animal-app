package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedBLTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public BedBLTile(final int id) {
        super(Assets.getBedBL(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
