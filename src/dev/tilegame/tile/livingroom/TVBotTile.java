package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class TVBotTile extends Tile {
    public TVBotTile(int id) {
        super(Assets.tvBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
