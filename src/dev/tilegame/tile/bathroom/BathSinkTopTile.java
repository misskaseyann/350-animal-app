package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BathSinkTopTile extends Tile {
    public BathSinkTopTile(int id) {
        super(Assets.bathSinkTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
