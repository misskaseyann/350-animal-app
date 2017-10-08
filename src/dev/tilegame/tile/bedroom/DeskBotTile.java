package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DeskBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public DeskBotTile(final int id) {
        super(Assets.getDeskBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
