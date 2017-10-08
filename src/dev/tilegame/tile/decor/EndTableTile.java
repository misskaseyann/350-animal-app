package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class EndTableTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public EndTableTile(final int id) {
        super(Assets.getEndTable(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
