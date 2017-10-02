package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterEndTile extends Tile {
    public CounterEndTile(int id) {
        super(Assets.counterEnd, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
