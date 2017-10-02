package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallLeftTile extends Tile {
    public WallLeftTile(int id) {
        super(Assets.wallLeft, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
