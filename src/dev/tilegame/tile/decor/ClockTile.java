package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ClockTile extends Tile {
    public ClockTile(int id) {
        super(Assets.clock, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
