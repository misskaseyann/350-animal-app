package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedBLTile extends Tile {
    public BedBLTile(int id) {
        super(Assets.bedBL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
