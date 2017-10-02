package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingEndTile extends Tile {
    public CeilingEndTile(int id) {
        super(Assets.ceilingEnd, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
