package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PlantBotTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public PlantBotTile(final int id) {
        super(Assets.getPlantBot(), id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
