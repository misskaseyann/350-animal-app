package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class TVBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public TVBotTile(final int id) {
        super(Assets.getTvBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
