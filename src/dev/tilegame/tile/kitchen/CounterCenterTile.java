package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CounterCenterTile extends Tile {
    public CounterCenterTile(int id) {
        super(Assets.counterCenter, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
