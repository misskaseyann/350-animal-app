package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BedBRTile extends Tile {
    public BedBRTile(int id) {
        super(Assets.bedBR, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
