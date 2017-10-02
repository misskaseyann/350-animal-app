package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DiningBRTile extends Tile {
    public DiningBRTile(int id) {
        super(Assets.diningBR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
