package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PlantTopTile extends Tile {
    public PlantTopTile(int id) {
        super(Assets.plantTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
