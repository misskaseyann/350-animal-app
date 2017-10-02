package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfTRTile extends Tile {
    public ShelfTRTile(int id) {
        super(Assets.shelfTR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
