package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallTCTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public OutWallTCTile(final int id) {
        super(Assets.getOutWallTC(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
