package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingLeftTile extends Tile {
    public CeilingLeftTile(int id) {
        super(Assets.ceilingLeft, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
