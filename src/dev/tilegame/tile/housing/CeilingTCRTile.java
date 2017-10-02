package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingTCRTile extends Tile {
    public CeilingTCRTile(int id) {
        super(Assets.ceilingTCR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
