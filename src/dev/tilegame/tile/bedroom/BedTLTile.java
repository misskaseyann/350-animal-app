package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedTLTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public BedTLTile(final int id) {
        super(Assets.getBedTL(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
