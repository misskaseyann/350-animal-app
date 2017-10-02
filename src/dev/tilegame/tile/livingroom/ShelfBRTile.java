package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShelfBRTile extends Tile {
    public ShelfBRTile(int id) {
        super(Assets.shelfBR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
