package dev.tilegame.tile.decor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class PlantBotTile extends Tile {
    public PlantBotTile(int id) {
        super(Assets.plantBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
