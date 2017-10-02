package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkLBotTile extends Tile {
    public SinkLBotTile(int id) {
        super(Assets.sinkLBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
