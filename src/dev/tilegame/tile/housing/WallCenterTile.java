package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallCenterTile extends Tile {
    public WallCenterTile(int id) {
        super(Assets.wallCenter, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
