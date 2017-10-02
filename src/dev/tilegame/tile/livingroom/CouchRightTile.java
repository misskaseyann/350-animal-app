package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CouchRightTile extends Tile {
    public CouchRightTile(int id) {
        super(Assets.couchRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
