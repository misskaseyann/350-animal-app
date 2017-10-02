package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingPRightTile extends Tile {
    public CeilingPRightTile(int id) {
        super(Assets.ceilingPRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
