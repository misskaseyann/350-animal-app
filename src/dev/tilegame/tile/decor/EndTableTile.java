package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class EndTableTile extends Tile {
    public EndTableTile(int id) {
        super(Assets.endTable, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
