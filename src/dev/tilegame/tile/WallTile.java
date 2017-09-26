package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class WallTile extends Tile {

    public WallTile(int id) {
        super(Assets.wallReg, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
