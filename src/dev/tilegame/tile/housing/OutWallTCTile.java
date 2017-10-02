package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallTCTile extends Tile {
    public OutWallTCTile(int id) {
        super(Assets.outWallTC, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
