package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class CeilingTCLTile extends Tile {
    public CeilingTCLTile(int id) {
        super(Assets.ceilingTCL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
