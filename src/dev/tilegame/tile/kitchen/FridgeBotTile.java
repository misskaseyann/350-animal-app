package dev.tilegame.tile.kitchen;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class FridgeBotTile extends Tile {
    public FridgeBotTile(int id) {
        super(Assets.fridgeBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
