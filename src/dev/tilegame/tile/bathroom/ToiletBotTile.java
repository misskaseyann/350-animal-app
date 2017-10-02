package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class ToiletBotTile extends Tile {
    public ToiletBotTile(int id) {
        super(Assets.toiletBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}