package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkLTopTile extends Tile {
    public SinkLTopTile(int id) {
        super(Assets.sinkLTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
