package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterCornerTile extends Tile {

    /**
     * filler.
     * @param id filler
     * */
    public CounterCornerTile(final int id) {
        super(Assets.getCounterCorner(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
