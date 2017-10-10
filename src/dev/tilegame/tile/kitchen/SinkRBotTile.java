package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkRBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public SinkRBotTile(final int id) {
        super(Assets.getSinkRBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
