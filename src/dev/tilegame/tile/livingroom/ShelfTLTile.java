package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfTLTile extends Tile {
    public ShelfTLTile(int id) {
        super(Assets.shelfTL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
