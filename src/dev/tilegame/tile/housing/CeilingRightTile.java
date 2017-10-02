package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingRightTile extends Tile {
    public CeilingRightTile(int id) {
        super(Assets.ceilingRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
