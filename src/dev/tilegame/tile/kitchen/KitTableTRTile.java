package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitTableTRTile extends Tile {
    public KitTableTRTile(int id) {
        super(Assets.kitTableTR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
