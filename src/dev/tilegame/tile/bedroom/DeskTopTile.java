package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DeskTopTile extends Tile {
    public DeskTopTile(int id) {
        super(Assets.deskTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
