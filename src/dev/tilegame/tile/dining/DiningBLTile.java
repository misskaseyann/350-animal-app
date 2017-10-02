package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningBLTile extends Tile {
    public DiningBLTile(int id) {
        super(Assets.diningBL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
