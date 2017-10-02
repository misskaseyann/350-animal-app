package dev.tilegame.tile.bathroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class BathSinkBotTile extends Tile {
    public BathSinkBotTile(int id) {
        super(Assets.bathSinkBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
