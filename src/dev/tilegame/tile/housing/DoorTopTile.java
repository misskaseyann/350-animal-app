package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DoorTopTile extends Tile {
    public DoorTopTile(int id) {
        super(Assets.doorTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
