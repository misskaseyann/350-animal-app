package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallLeftTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public WallLeftTile(final int id) {
        super(Assets.getWallLeft(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
