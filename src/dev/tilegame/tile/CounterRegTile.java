package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.25.2017
 */
public class CounterRegTile extends Tile {

    public CounterRegTile(int id) {
        super(Assets.counterReg, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
