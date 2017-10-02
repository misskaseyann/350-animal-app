package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ShowerTopTile extends Tile {
    public ShowerTopTile(int id) {
        super(Assets.showerTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
