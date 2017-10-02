package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallTLTile extends Tile {
    public OutWallTLTile(int id) {
        super(Assets.outWallTL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
