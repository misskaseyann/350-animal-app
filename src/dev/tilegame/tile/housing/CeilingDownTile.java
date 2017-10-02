package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingDownTile extends Tile {
    public CeilingDownTile(int id) {
        super(Assets.ceilingDown, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
