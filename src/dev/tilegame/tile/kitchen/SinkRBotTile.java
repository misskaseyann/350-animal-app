package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkRBotTile extends Tile {
    public SinkRBotTile(int id) {
        super(Assets.sinkRBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}