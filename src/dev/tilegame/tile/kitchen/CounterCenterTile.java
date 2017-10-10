package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterCenterTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public CounterCenterTile(final int id) {
        super(Assets.getCounterCenter(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
