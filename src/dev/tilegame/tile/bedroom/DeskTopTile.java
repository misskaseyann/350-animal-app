package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DeskTopTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public DeskTopTile(final int id) {
        super(Assets.getDeskTop(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
