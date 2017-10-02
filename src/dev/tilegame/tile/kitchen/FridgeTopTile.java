package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class FridgeTopTile extends Tile {
    public FridgeTopTile(int id) {
        super(Assets.fridgeTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
