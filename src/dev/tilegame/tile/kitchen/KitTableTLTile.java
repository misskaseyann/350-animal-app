package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitTableTLTile extends Tile {
    public KitTableTLTile(int id) {
        super(Assets.kitTableTL, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
