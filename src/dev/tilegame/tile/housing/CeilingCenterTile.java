package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingCenterTile extends Tile {
    public CeilingCenterTile(int id) {
        super(Assets.ceilingCenter, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
