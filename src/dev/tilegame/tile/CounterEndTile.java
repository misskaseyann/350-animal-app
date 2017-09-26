package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.25.2017
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
