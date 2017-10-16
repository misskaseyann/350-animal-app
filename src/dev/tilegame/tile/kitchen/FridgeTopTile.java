package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class FridgeTopTile extends Tile {
    /**
     * Constructor Fridge Top tile.
     * @param id an int that sets a numerical id to the tile.
     * */
    public FridgeTopTile(final int id) {
        super(Assets.getFridgeTop(), id);
    }

    /**
     * The isSolid boolean is overridden to say this is a solid object.
     * @return true because this object is solid and the pet can not
     * walk over it.
     */
    @Override
    public boolean isSolid() {
        return true;
    }
}
