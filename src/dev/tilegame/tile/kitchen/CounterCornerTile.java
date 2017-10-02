package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterCornerTile extends Tile {
    public CounterCornerTile(int id) {
        super(Assets.counterCorner, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}