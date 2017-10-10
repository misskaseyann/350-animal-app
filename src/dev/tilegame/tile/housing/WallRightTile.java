package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallRightTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public WallRightTile(final int id) {
        super(Assets.getWallRight(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
