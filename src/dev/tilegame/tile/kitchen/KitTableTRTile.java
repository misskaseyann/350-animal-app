package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitTableTRTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public KitTableTRTile(final int id) {
        super(Assets.getKitTableTR(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
