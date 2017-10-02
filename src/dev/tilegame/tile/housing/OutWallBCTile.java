package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallBCTile extends Tile {
    public OutWallBCTile(int id) {
        super(Assets.outWallBC, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}