package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfBLTile extends Tile {
    public ShelfBLTile(int id) {
        super(Assets.shelfBL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}