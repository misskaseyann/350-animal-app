package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningBRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public DiningBRTile(final int id) {
        super(Assets.getDiningBR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
