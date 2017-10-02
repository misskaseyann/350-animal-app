package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class StoveTopTile extends Tile {
    public StoveTopTile(int id) {
        super(Assets.stoveTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
