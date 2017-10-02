package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningTRTile extends Tile {
    public DiningTRTile(int id) {
        super(Assets.diningTR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
