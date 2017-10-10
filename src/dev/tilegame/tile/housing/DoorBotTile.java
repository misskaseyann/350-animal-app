package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DoorBotTile extends Tile {

    /**
     * filler.
     * @param id filler
     * */
    public DoorBotTile(final int id) {
        super(Assets.getDoorBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
