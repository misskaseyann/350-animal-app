package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingBCRTile extends Tile {
    public CeilingBCRTile(int id) {
        super(Assets.ceilingBCR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
