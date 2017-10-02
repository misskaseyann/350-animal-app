package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallRightTile extends Tile {
    public WallRightTile(int id) {
        super(Assets.wallRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
