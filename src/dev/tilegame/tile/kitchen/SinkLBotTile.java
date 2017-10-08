package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class SinkLBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public SinkLBotTile(final int id) {
        super(Assets.getSinkLBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
