package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedTRTile extends Tile {
    public BedTRTile(int id) {
        super(Assets.bedTR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
