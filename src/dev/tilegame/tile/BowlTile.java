package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.25.2017
 */
public class BowlTile extends Tile {

    public BowlTile(int id) {
        super(Assets.bowl, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
