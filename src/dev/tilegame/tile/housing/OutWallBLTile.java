package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallBLTile extends Tile {
    public OutWallBLTile(int id) {
        super(Assets.outWallBL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
