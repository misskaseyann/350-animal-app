package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class RegCeilingTile extends Tile {

    public RegCeilingTile(int id) {
        super(Assets.ceilingLRReg, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
