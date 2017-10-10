package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ChairLeftTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public ChairLeftTile(final int id) {
        super(Assets.getChairLeft(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
