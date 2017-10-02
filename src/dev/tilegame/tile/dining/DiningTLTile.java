package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningTLTile extends Tile {
    public DiningTLTile(int id) {
        super(Assets.diningTL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
