package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkLTopTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public SinkLTopTile(final int id) {
        super(Assets.getSinkLTop(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
