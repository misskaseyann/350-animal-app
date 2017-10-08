package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PlantTopTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public PlantTopTile(final int id) {
        super(Assets.getPlantTop(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
