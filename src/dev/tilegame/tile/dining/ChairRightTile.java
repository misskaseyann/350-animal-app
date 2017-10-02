package dev.tilegame.tile.dining;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ChairRightTile extends Tile {
    public ChairRightTile(int id) {
        super(Assets.chairRight, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
