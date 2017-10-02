package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class WallEndTile extends Tile {
    public WallEndTile(int id) {
        super(Assets.wallEnd, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}