package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallBRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public OutWallBRTile(final int id) {
        super(Assets.getOutWallBR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
