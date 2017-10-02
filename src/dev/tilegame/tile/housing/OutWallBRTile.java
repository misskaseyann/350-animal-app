package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class OutWallBRTile extends Tile {
    public OutWallBRTile(int id) {
        super(Assets.outWallBR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
