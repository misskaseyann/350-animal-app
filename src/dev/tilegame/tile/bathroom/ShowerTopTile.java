package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShowerTopTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ShowerTopTile(final int id) {
        super(Assets.getShowerTop(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
