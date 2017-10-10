package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class FridgeBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public FridgeBotTile(final int id) {
        super(Assets.getFridgeBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
