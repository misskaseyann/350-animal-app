package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallTRTile extends Tile {
    public OutWallTRTile(int id) {
        super(Assets.outWallTR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
