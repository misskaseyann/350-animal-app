package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkRTopTile extends Tile {
    public SinkRTopTile(int id) {
        super(Assets.sinkRTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
