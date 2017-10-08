package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterEndTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CounterEndTile(final int id) {
        super(Assets.getCounterEnd(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
