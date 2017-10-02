package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitTableBLTile extends Tile {
    public KitTableBLTile(int id) {
        super(Assets.kitTableBL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
