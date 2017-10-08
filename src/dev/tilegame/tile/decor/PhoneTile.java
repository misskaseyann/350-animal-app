package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PhoneTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public PhoneTile(final int id) {
        super(Assets.getPhone(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
