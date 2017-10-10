package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class StoveBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public StoveBotTile(final int id) {
        super(Assets.getStoveBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
